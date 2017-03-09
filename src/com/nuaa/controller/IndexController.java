package com.nuaa.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {
	public void index(){
		this.render("/hello.jsp");
	}
	
	
	
	public void sayHello() {

		String userName = this.getPara("userName");

		String sayHello = "Hello " + userName + ",welcome to JFinal world.";
		
		System.out.println(sayHello);
		
		this.setAttr("sayHello", sayHello);

		this.render("/hello.jsp");

	}
}
