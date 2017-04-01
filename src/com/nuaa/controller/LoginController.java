package com.nuaa.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import com.jfinal.core.Controller;
import com.nuaa.active.LoginActivity;
import com.nuaa.entiy.User;


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
		

		List<?> list=login.LoginCheck(userName, passWord);
		int i=0;
		for(i=0;i<list.size();i++){
			if(((User)(list.get(i))).getUserName().equals(userName)&&((User)(list.get(i))).getPassWord().equals(passWord)){
				break;
			}
		}
		if(i==list.size()){
			//错误,则返回原界面并带参数;
			this.setAttr("result", "false"); 
			this.render("/login.jsp");
		}else{
			//正确,则跳转;但是为了保证返回时不再次出现提示,需要重写参数;
			this.setAttr("result", "true"); 
			this.redirect("/IndexController");
			
			//正确写入session;
			this.setSessionAttr("username", userName);
			this.setSessionAttr("permission", ((User)list.get(i)).getPermission());
		}
	}
	
	public void Logout(){
		HttpSession session=this.getSession(false);
		if(session != null){
			session.removeAttribute("username");
			session.removeAttribute("permission");
		}
		this.redirect("/LoginController");
	}
}
