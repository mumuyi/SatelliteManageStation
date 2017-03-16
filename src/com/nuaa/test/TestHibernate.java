package com.nuaa.test;

import java.util.List;

import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.Parameter;

public class TestHibernate {
	public static void main(String[] arv){
		List<?> list=MyHibernate.sqlQuery(0, 300, "from Parameter");
		System.out.println(""+list.size());
		for(int i=0;i<list.size();i++){
			Parameter parameter=(Parameter)list.get(i);
			System.out.println(""+parameter.getNumber());
		}
	}
}
