package com.nuaa.test;

import java.util.Date;
import java.util.List;

import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.PassWordChangeDate;
import com.nuaa.entiy.User;

public class TestClass2 {

	public static void main(String[] args) {
		PassWordChangeDate pcd=new PassWordChangeDate();
		pcd.setUserName("11");
		pcd.setChangeDate(new Date());
		MyHibernate.sqlSaveOrUpdate(pcd);
		
		//List<?> list=MyHibernate.sqlQuery(0, 1, "from PassWordChangeDate");
		//PassWordChangeDate pcd1=(PassWordChangeDate) list.get(0);
		//System.out.println("年:"+pcd1.getChangeDate().getYear()+"  月:"+(pcd1.getChangeDate().getMonth()+1)+"  日:"+pcd1.getChangeDate().getDate());
		//User user=new User();
		//user.setUserName("11");
		//if(pcd.JudgeTime(user))
		//	System.out.println("11111111111111111");
		//else
		//	System.out.println("22222222222222222");
	}

}
