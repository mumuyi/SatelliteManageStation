package com.nuaa.myrunnable;

import com.nuaa.active.MessageParsing;

public class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Begin to Pars Message");
		for(int i=0;i<450;i++){
			//解压;
			System.out.println("Parsing num = "+i);
			MessageParsing mp=new MessageParsing();
			try {
				//由于新的数据总是放在文件最后,所以每次取最后一帧;
				mp.Parsing("C:\\Users\\ai\\Desktop\\data\\20111123.dat",i);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//休眠2s;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Pars Message End");
	}
}
