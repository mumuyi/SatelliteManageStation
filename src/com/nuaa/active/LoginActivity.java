package com.nuaa.active;

import java.util.List;

import com.nuaa.entiy.MyHibernate;

public class LoginActivity {
	public List<?> LoginCheck(String userName,String passWord){
		List<?> list=MyHibernate.sqlQuery(0, 400, "from User");

		
		return list;
	}
}
