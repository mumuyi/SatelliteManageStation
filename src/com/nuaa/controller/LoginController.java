package com.nuaa.controller;


import com.jfinal.core.Controller;
import com.nuaa.active.LoginActivity;


public class LoginController extends Controller{
	public void index() {
		this.render("/login.jsp");
	}
	
	public void Login(){
		LoginActivity login=new LoginActivity();
		
		String userName = this.getPara("username"); 
		String passWord = this.getPara("password"); 
		

		if(!login.LoginCheck(userName, passWord)){
			this.render("/login.jsp");
		}else{
			this.redirect("/IndexController");
		}
	}
}
