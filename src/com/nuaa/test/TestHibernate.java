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
		List<?> framelist=MyHibernate.sqlQuery(0, 400, "from FrameData");
		
		List<?> list=MyHibernate.sqlQueryWithCondition("from Parameter where Sort=? and Sort1=?",""+1,""+1);
		System.out.println(""+framelist.size());
		StringBuffer ans=new StringBuffer();
		System.out.println("1111111111 :"+((FrameData)(framelist.get(framelist.size()-1))).getYsj023());
		
		
		for(int i=0;i<framelist.size()-50;i++){
			
			FrameData frame=(FrameData)framelist.get(i);
			Class<? extends FrameData> myclass=frame.getClass();
			for(int j=0;j<list.size();j++){
				Parameter parameter=(Parameter)list.get(j);
				//System.out.println(""+parameter.getNumber()+" " +parameter.getName()+"  "+parameter.getCname());
				
				Method m = (Method) myclass.getMethod("get" + TestHibernate.captureName(parameter.getName()));
				ans.append(m.invoke(frame));
			}
			
		}
		System.out.println(ans);
		System.out.println(ans.toString());
		
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
		
		/*
		FrameData frame=new FrameData();
		Class<? extends FrameData> myclass=frame.getClass();
		
		Method m = (Method) myclass.getMethod("setCounter",int.class);
		m.invoke(frame, 232323);
		
		System.out.println("                      "+frame.getCounter());
		*/
	}
	
    public static String captureName(String name) {
        char[] cs=name.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);
    }
}
