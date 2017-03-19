package com.nuaa.controller;

import java.lang.reflect.InvocationTargetException;

import com.jfinal.core.Controller;
import com.nuaa.active.MessageParsing;
import com.nuaa.active.PrepareData;

import net.sf.json.JSONObject;

public class MainContentController extends Controller {
	public void index() {
		
		if(this.getPara(0).equals("1")){
			this.render("/maincontent.jsp");			
		}else if(this.getPara(0).equals("2")){
			this.render("/maincontent2.jsp");
		}else if(this.getPara(0).equals("3")){
			this.render("/maincontent3.jsp");
		}
	}
	
	public void getData() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//初始化类;
		PrepareData pa=new PrepareData();
		//初始化结果;
		String jsondata="";
		
		//获取参数;
		int page=Integer.parseInt(this.getPara("page"));
		int rows=Integer.parseInt(this.getPara("rows"));
		int Sort=Integer.parseInt(this.getPara(0));
		int Sort1=Integer.parseInt(this.getPara(1));
		String tempsidx=this.getPara("sidx");
		String sord=this.getPara("sord");

		//排序;
		if(!tempsidx.equals("")){
			String sidx=MessageParsing.captureName(tempsidx);
			jsondata+=pa.getTableData("FrameData", page, rows,Sort,Sort1,sidx,sord);
		}
		//不排序;
		else{
			jsondata+=pa.getTableData("FrameData", page, rows,Sort,Sort1);
		}

		
		
		
		this.renderJson(JSONObject.fromObject(jsondata));
	}
	
	public void getiniData(){
		System.out.println("1111111111111111");
		int value=200;
		String data="[{\"value\":\""+value+"\"}]";
		//System.out.println(JSONObject.fromObject(data));
		System.out.println(data);
		//this.renderJson(data);
		this.renderText(data);
	}
}
