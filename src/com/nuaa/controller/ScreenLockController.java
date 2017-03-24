package com.nuaa.controller;

import com.jfinal.core.Controller;

public class ScreenLockController extends Controller{
	public void index() {
		this.render("/screenlock.jsp");
	}
	
	public void Login(){
		this.redirect("/IndexController");
	}
}
