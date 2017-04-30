package com.nuaa.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.nuaa.controller.IndexController;
import com.nuaa.controller.LoginController;
import com.nuaa.controller.MainContentController;
import com.nuaa.controller.PassWordChangeController;
import com.nuaa.controller.ScreenLockController;
import com.nuaa.controller.UserManageController;
import com.nuaa.handler.ContextPathHandler;

public class MyAppConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		// TODO Auto-generated method stub
		me.setDevMode(true);
		me.setEncoding("utf-8");
		me.setViewType(ViewType.JSP);
	}

	@Override
	public void configEngine(Engine arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		me.add(new ContextPathHandler("ctx"));
	}

	@Override
	public void configInterceptor(Interceptors arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configPlugin(Plugins arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub
		me.add("/",LoginController.class);
		me.add("/IndexController",IndexController.class);
		me.add("/MainContentController",MainContentController.class);
		me.add("/ScreenLockController",ScreenLockController.class);
		me.add("/PassWordChangeController",PassWordChangeController.class);
		me.add("/UserManageController",UserManageController.class);
	}

}
