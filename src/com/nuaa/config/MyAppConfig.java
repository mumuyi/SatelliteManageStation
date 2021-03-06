package com.nuaa.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.cron4j.Cron4jPlugin;
import com.jfinal.render.ViewType;
import com.jfinal.template.Engine;
import com.nuaa.controller.IndexController;
import com.nuaa.controller.LoginController;
import com.nuaa.controller.MainContentController;
import com.nuaa.controller.PassWordChangeController;
import com.nuaa.controller.ScreenLockController;
import com.nuaa.controller.UserManageController;
import com.nuaa.handler.ContextPathHandler;
import com.nuaa.myrunnable.MonitorTask;
import com.nuaa.myrunnable.MyTask;


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
	public void configPlugin(Plugins me) {
		//下行数据获取;
		Cron4jPlugin cp=new Cron4jPlugin();
		cp.addTask("0 3,9,15,21 * * *", new MyTask());
		//me.add(cp);
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/",LoginController.class);
		me.add("/IndexController",IndexController.class);
		me.add("/MainContentController",MainContentController.class);
		me.add("/ScreenLockController",ScreenLockController.class);
		me.add("/PassWordChangeController",PassWordChangeController.class);
		me.add("/UserManageController",UserManageController.class);
	}

	public void afterJFinalStart(){
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!项目启动完成,开始进行卫星健康监测");
		MonitorTask mt=new MonitorTask();
		Thread th=new Thread(mt);
		th.start();
	}
}
