package com.nuaa.controller;

import java.util.List;

import com.jfinal.core.Controller;
import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.User;

public class LoginController extends Controller{
	public void index() {
		this.render("/login.jsp");
	}
	
	public void Login(){
		String userName = this.getPara("username"); 
		String passWord = this.getPara("password"); 
		
		List<?> list=MyHibernate.sqlQuery(0, 400, "from User");
		int i=0;
		for(i=0;i<list.size();i++){
			if(((User)(list.get(i))).getUserName().equals(userName)&&((User)(list.get(i))).getPassWord().equals(passWord)){
				break;
			}
		}
		if(i==list.size()){
			this.render("/login.jsp");
		}else{
			this.redirect("/IndexController");
		}
	}
}
