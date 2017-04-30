package com.nuaa.controller;

import java.util.Date;

import com.jfinal.core.Controller;
import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.PassWordChangeDate;
import com.nuaa.entiy.User;

public class PassWordChangeController extends Controller{
	public void index(){
		this.render("/changepassword.jsp");
	}
	
	public void ChangePassWord(){
		String oldpassWord = this.getPara("oldpassword");
		String newpassWord = this.getPara("newpassword");
		String newpassWord1 = this.getPara("newpassword1");
		String userName=this.getSessionAttr("username");
		String permission=this.getSessionAttr("permission");
		
		if((!newpassWord.equals(newpassWord1))||(oldpassWord.equals(newpassWord))){
			//提示;
		}else{
			//更新密码修改时间;
			PassWordChangeDate pcd=new PassWordChangeDate();
			pcd.setChangeDate(new Date());
			pcd.setUserName(userName);
			MyHibernate.sqlSaveOrUpdate(pcd);
			
			//更新密码;
			User user=new User();
			user.setPassWord(newpassWord);
			user.setUserName(userName);
			user.setPermission(permission);
			MyHibernate.sqlSaveOrUpdate(user);
			
			//跳转主界面;
			this.setAttr("result", "true"); 
			this.redirect("/IndexController");
		}
	}
}

