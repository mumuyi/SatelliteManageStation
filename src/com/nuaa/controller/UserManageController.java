package com.nuaa.controller;

import java.io.IOException;


import javax.servlet.http.HttpServletResponse;

import com.jfinal.core.Controller;
import com.nuaa.active.UserManage;


import net.sf.json.JSONObject;

public class UserManageController extends Controller {
	public void index() {
		String permission=this.getSessionAttr("permission");
		if(permission.charAt(4)=='1')
			this.render("/usermanage.jsp");
		else{
			//返回界面,进行提示;
			this.setAttr("permissionverify", "false");
			this.render("/datapage1.jsp");
		}
	}

	public void TableIni() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!UserManageController");
		// 初始化操作类;
		UserManage um = new UserManage();
		// 初始化结果;
		String jsondata = "";
		jsondata += um.getTableData();
		this.renderJson(JSONObject.fromObject(jsondata));
	}

	public void TableOpration() throws IOException {		
		//获取参数;
		//操作类型;
		String oper=this.getPara("oper");
		//用户名;
		String userName=this.getPara("username");
		//权限;
		String permission="";
		for(int i=0;i<5;i++){
			if(this.getPara(("permission"+(i+1))).equals("1")){
				permission+=1;
			}else{
				permission+=0;
			}
		}
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+this.getPara("permission1")+this.getPara("permission2")+this.getPara("permission3")+this.getPara("permission4")+this.getPara("permission5"));
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+permission+"   "+userName+"   "+oper);
		//处理;
		UserManage um=new UserManage();
		um.TableDataOpration(userName, permission, oper);
	}
}
