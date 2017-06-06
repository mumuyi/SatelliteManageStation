package com.nuaa.myrunnable;

import java.util.List;
import java.util.Map;

import com.nuaa.active.ThresholdJudgment;
import com.nuaa.entiy.FrameData;
import com.nuaa.entiy.MyHibernate;
import com.nuaa.websocket.MyWebSocketDataPage1;
import com.nuaa.websocket.MyWebSocketDataPage10;
import com.nuaa.websocket.MyWebSocketDataPage5;
import com.nuaa.websocket.MyWebSocketDataPage6;
import com.nuaa.websocket.MyWebSocketDataPage7;
import com.nuaa.websocket.MyWebSocketDataPage8;
import com.nuaa.websocket.MyWebSocketDataPage9;

public class MonitorTask implements Runnable{
	
	private static List<?> framelist;
	private static List<?> list;
	private static List<?> list5;
	private static List<?> list6;
	private static List<?> list7;
	private static List<?> list8;
	private static List<?> list9;
	private static int temp=0;
	
	@Override
	public void run() {
		//初始化数据;
		framelist = MyHibernate.sqlQuery(0, 400, "from FrameData");
		list = MyHibernate.sqlQuery(0,400,"from Parameter");
		list5 = MyHibernate.sqlQueryWithCondition("from Parameter where Sort=?", "5");
		list6 = MyHibernate.sqlQueryWithCondition("from Parameter where Sort=?", "6");
		list7 = MyHibernate.sqlQueryWithCondition("from Parameter where Sort=?", "7");
		list8 = MyHibernate.sqlQueryWithCondition("from Parameter where Sort=?", "8");
		list9 = MyHibernate.sqlQueryWithCondition("from Parameter where Sort=?", "9");
		
		ThresholdJudgment tj=new ThresholdJudgment();
		
		int i=0;
		for(i=0;i<300000;i++){
			System.out.println("Monitor Task Test num = "+i);

			if(MyWebSocketDataPage5.getOnlineCount()>0){
				try {
					MyWebSocketDataPage5.sendOnTimeMessage(i,framelist,list5);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(MyWebSocketDataPage6.getOnlineCount()>0){
				try {
					MyWebSocketDataPage6.sendOnTimeMessage(i,framelist,list6);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(MyWebSocketDataPage7.getOnlineCount()>0){
				try {
					MyWebSocketDataPage7.sendOnTimeMessage(i,framelist,list7);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(MyWebSocketDataPage8.getOnlineCount()>0){
				try {
					MyWebSocketDataPage8.sendOnTimeMessage(i,framelist,list8);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(MyWebSocketDataPage9.getOnlineCount()>0){
				try {
					MyWebSocketDataPage9.sendOnTimeMessage(i,framelist,list9);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(MyWebSocketDataPage10.getOnlineCount()>0){
				try {
					MyWebSocketDataPage10.sendOnTimeMessage(i,framelist,list7);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			/*
			try {
				Map<String, String> map=tj.Judgment((FrameData)framelist.get(i),list);
				if(!map.isEmpty()&&temp==0){
					for(int j=0;j<map.size()/3;j++){
						if(MyWebSocketDataPage1.sendErrorOrWarning(map.get("name"+j),"error", map.get("sorttype"+j), map.get("sorttype1"+j))){
							temp=1;
							Runnable1 r=new Runnable1();
							Thread th=new Thread(r);
							th.start();
						}
					}
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			*/
			
			
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	class Runnable1 implements Runnable {
		public void run() {
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			temp=0;
		}
	}
}
