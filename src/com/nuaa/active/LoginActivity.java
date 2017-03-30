package com.nuaa.active;

import java.util.List;

import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.User;

public class LoginActivity {
	public boolean LoginCheck(String userName,String passWord){
		List<?> list=MyHibernate.sqlQuery(0, 400, "from User");
		int i=0;
		for(i=0;i<list.size();i++){
			if(((User)(list.get(i))).getUserName().equals(userName)&&((User)(list.get(i))).getPassWord().equals(passWord)){
				break;
			}
		}
		if(i==list.size()){
			return false;
		}else{
			return true;
		}
	}
}
