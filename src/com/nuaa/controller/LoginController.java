package com.nuaa.controller;


import com.jfinal.core.Controller;
import com.nuaa.active.LoginActivity;


public class LoginController extends Controller{
	public void index() {
		//这个参数只是起占位作用,因为login.jsp每次启动时都会取result,这里只是防止取不到报错;
		this.setAttr("result", "not-login-yet"); 
		this.render("/login.jsp");
	}
	
	public void Login(){
		LoginActivity login=new LoginActivity();
		
		String userName = this.getPara("username"); 
		String passWord = this.getPara("password"); 
		

		if(!login.LoginCheck(userName, passWord)){
			//错误,则返回原界面并带参数;
			this.setAttr("result", "false"); 
			this.render("/login.jsp");
		}else{
			//正确,则跳转;但是为了保证返回时不再次出现提示,需要重写参数;
			this.setAttr("result", "true"); 
			this.redirect("/IndexController");
		}
	}
}
