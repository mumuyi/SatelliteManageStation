package com.nuaa.myrunnable;

import com.nuaa.websocket.MyWebSocketDataPage5;
import com.nuaa.websocket.MyWebSocketDataPage6;
import com.nuaa.websocket.MyWebSocketDataPage7;
import com.nuaa.websocket.MyWebSocketDataPage8;
import com.nuaa.websocket.MyWebSocketDataPage9;

public class MonitorTask implements Runnable{

	@Override
	public void run() {
		int i=0;
		for(i=0;i<300000;i++){
			System.out.println("Monitor Task Test num = "+i);

			if(MyWebSocketDataPage5.getOnlineCount()>0){
				try {
					MyWebSocketDataPage5.sendOnTimeMessage(i);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(MyWebSocketDataPage6.getOnlineCount()>0){
				try {
					MyWebSocketDataPage6.sendOnTimeMessage(i);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(MyWebSocketDataPage7.getOnlineCount()>0){
				try {
					MyWebSocketDataPage7.sendOnTimeMessage(i);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(MyWebSocketDataPage8.getOnlineCount()>0){
				try {
					MyWebSocketDataPage8.sendOnTimeMessage(i);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(MyWebSocketDataPage9.getOnlineCount()>0){
				try {
					MyWebSocketDataPage9.sendOnTimeMessage(i);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
