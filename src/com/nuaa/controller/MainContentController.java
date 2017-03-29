package com.nuaa.controller;

import java.lang.reflect.InvocationTargetException;

import com.jfinal.core.Controller;
import com.nuaa.active.MessageParsing;
import com.nuaa.active.PrepareData;

import net.sf.json.JSONObject;

public class MainContentController extends Controller {
	public void index() {
		String Sord=this.getPara(0);
		String Sord1=this.getPara(1);
		if(Sord.equals("5")){
			if(Sord1.equals("1")){
				this.render("/datapage51.jsp");
			}else if(Sord1.equals("2")){
				this.render("/datapage52.jsp");
			}else if(Sord1.equals("3")){
				this.render("/datapage53.jsp");
			}else if(Sord1.equals("4")){
				this.render("/datapage54.jsp");
			}else if(Sord1.equals("5")){
				this.render("/datapage55.jsp");
			}
		}else if(Sord.equals("6")){
			if(Sord1.equals("1")){
				this.render("/datapage61.jsp");
			}else if(Sord1.equals("2")){
				this.render("/datapage62.jsp");
			}else if(Sord1.equals("3")){
				this.render("/datapage63.jsp");
			}else if(Sord1.equals("4")){
				this.render("/datapage64.jsp");
			}else if(Sord1.equals("5")){
				this.render("/datapage65.jsp");
			}
		}else if(Sord.equals("7")){
			if(Sord1.equals("1")){
				this.render("/datapage71.jsp");
			}else if(Sord1.equals("2")){
				this.render("/datapage72.jsp");
			}else if(Sord1.equals("3")){
				this.render("/datapage73.jsp");
			}else if(Sord1.equals("4")){
				this.render("/datapage74.jsp");
			}
		}else if(Sord.equals("8")){
			if(Sord1.equals("1")){
				this.render("/datapage81.jsp");
			}else if(Sord1.equals("2")){
				this.render("/datapage82.jsp");
			}else if(Sord1.equals("3")){
				this.render("/datapage83.jsp");
			}
		}else if(Sord.equals("9")){
			if(Sord1.equals("1")){
				this.render("/datapage91.jsp");
			}else if(Sord1.equals("2")){
				this.render("/datapage92.jsp");
			}else if(Sord1.equals("3")){
				this.render("/datapage93.jsp");
			}
		}
		
		/*
		if(this.getPara(0).equals("1")){
			this.render("/maincontent.jsp");			
		}else if(this.getPara(0).equals("2")){
			this.render("/maincontent2.jsp");
		}else if(this.getPara(0).equals("3")){
			this.render("/maincontent3.jsp");
		}
		*/
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
	
	
	public void getTableShowData() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//初始化类;
		PrepareData pa=new PrepareData();
		//初始化结果;
		String jsondata="";
		
		//获取参数;

		int Sort=Integer.parseInt(this.getPara(0));
		int Sort1=Integer.parseInt(this.getPara(1));



		jsondata+=pa.getTableShowData("FrameData", 1, 1,Sort,Sort1);


		
		
		
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
