package com.nuaa.controller;

import com.jfinal.core.Controller;

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
	
	public void getData() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		System.out.println("page : " + this.getPara("page") + "\n" + "rows : " + this.getPara("rows") + "\n" + // rows
				"sidx : " + this.getPara("sidx") + "\n" + // sidx
				"sord : " +this.getPara("sord") + "\n"); // sord");

		String jsondata = "{\"page\":\"1\"," + " \"total\":2," + " \"records\":\"10\","
				+" \"rows\":" 
				+ " [" 
					+ " {"+ " \"id\":\"1\"," + " \"cell\":"+ " [\"13\",\"2007-10-06\",\"Client 3\",\"1000.00\",\"0.00\",\"1000.00\",null]" + " }," 
					+ " {"+ " \"id\":\"2\"," + " \"cell\":"+ " [\"12\",\"2007-10-06\",\"Client 2\",\"700.00\",\"140.00\",\"840.00\",null]" + " }," 
					+ " {"+ " \"id\":\"3\"," + " \"cell\":"+ " [\"11\",\"2007-10-06\",\"Client 1\",\"600.00\",\"120.00\",\"720.00\",null]" + " }," 
					+ " {"+ " \"id\":\"4\"," + " \"cell\":"+ " [\"10\",\"2007-10-06\",\"Client 2\",\"100.00\",\"20.00\",\"120.00\",null]" + " }," 
					+ " {"+ " \"id\":\"5\"," + " \"cell\":"+ " [\"9\",\"2007-10-06\",\"Client 1\",\"200.00\",\"40.00\",\"240.00\",null]" + " }," 
					+ " {"+ " \"id\":\"6\"," + " \"cell\":"+ " [\"8\",\"2007-10-06\",\"Client 3\",\"200.00\",\"0.00\",\"200.00\",null]" + " }," 
					+ " {"+ " \"id\":\"7\"," + " \"cell\":"+ " [\"7\",\"2007-10-05\",\"Client 2\",\"120.00\",\"12.00\",\"134.00\",null]" + " }," 
					+ " {"+ " \"id\":\"8\"," + " \"cell\":"+ " [\"6\",\"2007-10-05\",\"Client 1\",\"50.00\",\"10.00\",\"60.00\",\"\"]" + " }," 
					+ " {"+ " \"id\":\"9\"," + " \"cell\":"+ " [\"5\",\"2007-10-05\",\"Client 3\",\"100.00\",\"0.00\",\"100.00\",\"no tax at all\"]" + " }," 
					+ " {"+ " \"id\":\"10\"," + " \"cell\":"+ " [\"4\",\"2007-10-04\",\"Client 3\",\"150.00\",\"0.00\",\"150.00\",\"no tax\"]" + " }" 
				+ " ],"
				+ " \"userdata\":{\"amount\":3220,\"tax\":342,\"total\":3564,\"name\":\"Totals:\"}" + " }";

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
