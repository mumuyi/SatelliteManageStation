package com.nuaa.active;

import java.util.Date;
import java.util.List;

import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.PassWordChangeDate;
import com.nuaa.entiy.User;


public class UserManage {

	public String getTableData(){

		// 准备数据;
		List<?> userlist = MyHibernate.sqlQuery(0, 20, "from User");


		String ans = "";
		// 初始化数据头;
		//返回的时候要对page+1 不然翻页按钮无效果;
		ans += "{\"page\":\"" + 1 + "\"," + " \"total\":\"" + 1 + "\"," + " \"records\":\"" + 20 + "\","
				+ " \"rows\":" + " [";

		// 填充数据;
		for (int i = 0; i < userlist.size(); i++) {
			User user=(User)userlist.get(i);
			ans += " {" + " \"id\":\"" + i + "\"," + " \"cell\":" + " [";
			//添加用户名信息;
			ans += "\""+user.getUserName()+"\",";
			//添加权限信息;
			for(int j=0;j<5;j++){
				if(user.getPermission().charAt(j)=='1'){
					ans += "\""+"有"+"\",";
				}else{
					ans += "\""+"无"+"\",";
				}
			}
			ans += "]" + " },";

		}
		ans += " ],";
		ans += " \"userdata\":{\"amount\":3220,\"tax\":342,\"total\":3564,\"name\":\"Totals:\"}" + " }";

		// System.out.println(ans);

		return ans;
	}
	
	public void TableDataOpration(String userName,String permission,String oper){
		if(oper.equals("edit")){
			User user=(User)MyHibernate.sqlQueryWithCondition("from User where UserName=?", userName).get(0);
			user.setPermission(permission);
			updataUser(user);
		}else if(oper.equals("add")){
			User user=new User();
			user.setUserName(userName);
			user.setPassWord("11");
			user.setPermission(permission);
			saveUser(user);
		}else if(oper.equals("delete")){
			User user=(User)MyHibernate.sqlQueryWithCondition("from User where UserName=?", userName).get(0);
			delUser(user);
		}
	}
	
	public void saveUser(User user){
		//添加用户;
		MyHibernate.sqlSaveOrUpdate(user);
		
		//添加密码修改时间信息;
		PassWordChangeDate pcd=new PassWordChangeDate();
		pcd.setUserName(user.getUserName());
		pcd.setChangeDate(new Date());
		MyHibernate.sqlSaveOrUpdate(pcd);
	}
	
	public void updataUser(User user){
		//更新用户;
		MyHibernate.sqlSaveOrUpdate(user);		
	}
	
	public void delUser(User user){
		//删除用户;
		MyHibernate.sqlSaveOrUpdate(user);
		
		//删除密码修改时间信息;
		PassWordChangeDate pcd=new PassWordChangeDate();
		pcd.setUserName(user.getUserName());
		pcd.setChangeDate(new Date());
		MyHibernate.sqlDelete(pcd);
	}
}
