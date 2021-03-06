package com.nuaa.websocket;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.nuaa.active.PrepareData;



//该注解用来指定一个URI，客户端可以通过这个URI来连接到WebSocket。类似Servlet的注解mapping。无需在web.xml中配置。
@ServerEndpoint("/chat9.ws")
public class MyWebSocketDataPage9 {
	// 静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
	private static int onlineCount = 0;

	// concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
	private static CopyOnWriteArraySet<MyWebSocketDataPage9> webSocketSet = new CopyOnWriteArraySet<MyWebSocketDataPage9>();

	// 与某个客户端的连接会话，需要通过它来给客户端发送数据
	private static Session session;

	//private static int flag=0;
	private static List<?> framelist;
	private static List<?> list;
	
	private static PrepareData pd=new PrepareData();
	/**
	 * 连接建立成功调用的方法
	 * 
	 * @param session
	 *            可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
	 */
	@OnOpen
	public void onOpen(Session session) {
		MyWebSocketDataPage9.session = session;
		webSocketSet.add(this); // 加入set中
		addOnlineCount(); // 在线数加1
		System.out.println("有新连接加入！当前在线人数为" + getOnlineCount());
		
		//第一次,初始化数据;
		//if(flag==0){
		//	framelist = MyHibernate.sqlQuery(0, 400, "from FrameData");
		//	list = MyHibernate.sqlQueryWithCondition("from Parameter where Sort=?", "9");
		//	flag=1;
		//}

		//Runnable1 r = new Runnable1();
        //r.run();并不是线程开启，而是简单的方法调用
        //Thread t = new Thread(r);//创建线程
        //t.run(); //如果该线程是使用独立的 Runnable 运行对象构造的，则调用该 Runnable 对象的 run 方法；否则，该方法不执行任何操作并返回。
        //t.start(); //线程开启
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
		session.getAsyncRemote().sendText(message);
	}

	public static void sendMessage(String message) throws IOException {
		// session.getBasicRemote().sendText(message);
		session.getAsyncRemote().sendText(message);
	}
	
	
	public static synchronized int getOnlineCount() {
		return onlineCount;
	}

	public static synchronized void addOnlineCount() {
		MyWebSocketDataPage9.onlineCount++;
	}

	public static synchronized void subOnlineCount() {
		MyWebSocketDataPage9.onlineCount--;
	}

	
	public static void main(String[] args){
		for (int i = 0; i < 100; i++) {
			//SimpleDateFormat df = new SimpleDateFormat("ms");//设置日期格式
			//String time=df.format(new Date()).toString();// new Date()为获取当前系统时间
			
			Date d = new Date();
			String time=Long.toString(d.getTime());
			Random random = new Random();
			String value =  Integer.toString((random.nextInt(200)%(151) + 50));
	    	
	    	
	    	System.out.println("Thread-----:"+" time:"+time+" value:"+value);
	    	System.out.println("[{\"time\":\""+time+"\",\"value\":\""+value+"\"}]");
		}
	}
	
	
	
	public static void sendOnTimeMessage(int i,List <?> framelist,List<?> list) throws Exception{
		String data="";
		data+=pd.prepareDynamicDisplayData(i, framelist, list);
		sendMessage(data);
	}
	
	
	class Runnable1 implements Runnable{
	    public void run() {
	        for (int i = 0; i < 100; i++) {
	        	if(MyWebSocketDataPage9.onlineCount>0){
		            String data="";
					try {
						//data += MyWebSocketDataPage9.prepareData(i);
						data+=pd.prepareDynamicDisplayData(i, framelist, list);
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
	}
}

