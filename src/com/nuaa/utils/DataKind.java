package com.nuaa.utils;

import java.util.Calendar;
import java.util.Date;

public class DataKind {
	/**
	 * 返回当前显示的数据的类型;
	 * 1=实时数据; 0=预测数据;
	 */
	public int getCurrentDataKind() {
		Calendar cl = Calendar.getInstance();
		cl.setTime(new Date());
		if(cl.get(Calendar.HOUR)==9||cl.get(Calendar.HOUR)==3){
			if(cl.get(Calendar.MINUTE)>=0&&cl.get(Calendar.MINUTE)<=15){
				return 0;
			}
		}
		return 1;
	}
	/**
	 * 
	 * 判断当前数据是否有预测的必要;
	 * 1=无预测必要; 0=有预测必要;
	 *
	 * */
	public int judgeDataPredictValue(String parameterName){
		if(parameterName.equals("yjs087"))
			return 0;
		else 
			return 1;
	}
	public static void main(String[] argv) {
		Calendar cl = Calendar.getInstance();
		cl.setTime(new Date());
		DataKind dk=new DataKind();
		System.out.println("" + cl.get(Calendar.HOUR_OF_DAY)+" "+cl.get(Calendar.MINUTE)+"  "+dk.getCurrentDataKind());
	}
}
