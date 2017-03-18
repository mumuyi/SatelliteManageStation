package com.nuaa.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.nuaa.entiy.FrameData;
import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.Parameter;
import com.nuaa.utils.DataOpration;

public class TestHibernate {
	public static void main(String[] arv) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//List<?> list=MyHibernate.sqlQuery(0, 300, "from Parameter");
		//System.out.println(""+list.size());
		//for(int i=0;i<list.size();i++){
		//	Parameter parameter=(Parameter)list.get(i);
		//	System.out.println(""+parameter.getNumber()+"  "+parameter.getCname()+"                "+parameter.getUnit());
		//}
		
		/*
		byte temp=(byte)0xAA;
		for(int i=0;i<8;i++){
			if(DataOpration.CheakBit(temp, i)){
				System.out.println("1");
			}else{
				System.out.println("0");
			}
		}
		*/
		
		/*
		byte[] temp=new byte[4];
		temp[0]=(byte)0xEF;
		temp[1]=(byte)0x03;
		temp[2]=(byte)0x00;
		temp[3]=(byte)0x00;
		int tt=DataOpration.byteToint(temp);
		System.out.println(""+tt);
		*/
		
		FrameData frame=new FrameData();
		Class<? extends FrameData> myclass=frame.getClass();
		
		Method m = (Method) myclass.getMethod("setCounter",int.class);
		m.invoke(frame, 232323);
		
		System.out.println("                      "+frame.getCounter());
	}
}
