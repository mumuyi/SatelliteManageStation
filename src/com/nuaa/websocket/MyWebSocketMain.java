package com.nuaa.websocket;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.nuaa.entiy.FrameData;
import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.Parameter;
import com.nuaa.test.TestHibernate;
import com.nuaa.utils.DataOpration;




//该注解用来指定一个URI，客户端可以通过这个URI来连接到WebSocket。类似Servlet的注解mapping。无需在web.xml中配置。
@ServerEndpoint("/wschat.ws")
public class MyWebSocketMain {
	// 静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
	private static int onlineCount = 0;

	// concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
	private static CopyOnWriteArraySet<MyWebSocketMain> webSocketSet = new CopyOnWriteArraySet<MyWebSocketMain>();

	// 与某个客户端的连接会话，需要通过它来给客户端发送数据
	private Session session;

	private static int Sord=0;
	private static int Sord1=0;
	
	private static int flag=0;
	private static List<?> framelist;
	private static List<?> list;
	
	private static int preSord=0;
	
	private static Runnable1 r;
	private static Thread t;
	/**
	 * 连接建立成功调用的方法
	 * 
	 * @param session
	 *            可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
	 */
	@OnOpen
	public void onOpen(Session session) {
		this.session = session;
		webSocketSet.add(this); // 加入set中
		addOnlineCount(); // 在线数加1
		System.out.println("有新连接加入！当前在线人数为" + getOnlineCount());
		
		//第一次,初始化数据;
		if(flag==0){
			framelist = MyHibernate.sqlQuery(0, 400, "from FrameData");
			r = new Runnable1();
			flag=1;
		}
	}

	/**
	 * 连接关闭调用的方法
	 */
	@OnClose
	public void onClose() {
		webSocketSet.remove(this); // 从set中删除
		subOnlineCount(); // 在线数减1
		System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
	}

	/**
	 * 收到客户端消息后调用的方法
	 * 
	 * @param message
	 *            客户端发送过来的消息
	 * @param session
	 *            可选的参数
	 * @throws IOException
	 */
	@OnMessage
	public void onMessage(String message, Session session) throws IOException {
		System.out.println("来自客户端的消息:" + message);
		//更新当前显示页面;
		Sord=message.charAt(0)-'0';
		Sord1=message.charAt(2)-'0';
		//更新list信息;
		//if(preSord!=Sord){
			if(t!=null)
				t.stop();
			list = MyHibernate.sqlQueryWithCondition("from Parameter where Sort=?", ""+Sord);
	        t = new Thread(r);//创建线程
	        t.start(); //线程开启
		//}
		preSord=Sord;
	}

	/**
	 * 发生错误时调用
	 * 
	 * @param session
	 * @param error
	 */
	@OnError
	public void onError(Session session, Throwable error) {
		System.out.println("发生错误");
		error.printStackTrace();
	}

	/**
	 * 这个方法与上面几个方法不一样。没有用注解，是根据自己需要添加的方法。
	 * 
	 * @param message
	 * @throws IOException
	 */
	public void sendMessage(String message, Session session) throws IOException {
		// session.getBasicRemote().sendText(message);
		this.session.getAsyncRemote().sendText(message);
	}

	public void sendMessage(String message) throws IOException {
		// session.getBasicRemote().sendText(message);
		this.session.getAsyncRemote().sendText(message);
	}
	
	
	public static synchronized int getOnlineCount() {
		return onlineCount;
	}

	public static synchronized void addOnlineCount() {
		MyWebSocketMain.onlineCount++;
	}

	public static synchronized void subOnlineCount() {
		MyWebSocketMain.onlineCount--;
	}
	
	
	class Runnable1 implements Runnable{
	    public void run() {
	        for (int i = 0; i < 100; i++) {
	            String data="";
				try {
					data += MyWebSocketMain.prepareData(i);
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
	            try {
					sendMessage(data);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            
	            
	            try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    }
	}
	
	
	/**
	 * 准备实时显示所需信息;
	 * 
	 * */
	public static String prepareData(int temp) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		String ans="[{";
		//添加数据类型标识;
		ans+="\""+"datatype"+"\":"+"\""+"timedata"+"\",";
		// 填充数据;
		FrameData frame = (FrameData) framelist.get(temp);
		Class<? extends FrameData> myclass = frame.getClass();
		//添加时间信息;
		ans+="\""+"ysj023"+"\":"+"\""+frame.getYsj023()+"\",";
		ans+="\""+"ysj024"+"\":"+"\""+frame.getYsj024()+"\",";
		//添加其余信息;
		for (int j = 0; j < list.size(); j++) {
			Parameter parameter = (Parameter) list.get(j);
			ans += "\""+parameter.getName()+"\":"+"\"";
			Method m = (Method) myclass.getMethod("get" + DataOpration.captureName(parameter.getName()));
			ans +="" + (m.invoke(frame));

			if (j == list.size() - 1) {
				ans += "\"";
			} else {
				ans += "\",";
			}
		}
		ans += "}]";
		return ans;
	}
}

