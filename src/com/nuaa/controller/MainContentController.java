package com.nuaa.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.jfinal.core.Controller;
import com.nuaa.active.MessageParsing;
import com.nuaa.active.PrepareData;
import com.nuaa.entiy.FrameData;
import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.Parameter;
import com.nuaa.utils.DataOpration;

import net.sf.json.JSONObject;

public class MainContentController extends Controller {
	public void index() {
		String Sord = this.getPara(0);
		String Sord1 = this.getPara(1);
		// 如果为空可能会报错,需要注意一下;
		String username = this.getSessionAttr("username");
		// String permission=this.getSessionAttr("permission");
		String permission = "11111111";
		if (Sord.equals("5") && permission.charAt(0) == '1') {
			if (Sord1.equals("1")) {
				this.render("/datapage51.jsp");
			} else if (Sord1.equals("2")) {
				this.render("/datapage52.jsp");
			} else if (Sord1.equals("3")) {
				this.render("/datapage53.jsp");
			} else if (Sord1.equals("4")) {
				this.render("/datapage54.jsp");
			} else if (Sord1.equals("5")) {
				this.render("/datapage55.jsp");
			}
		} else if (Sord.equals("6") && permission.charAt(1) == '1') {
			if (Sord1.equals("1")) {
				this.render("/datapage61.jsp");
			} else if (Sord1.equals("2")) {
				this.render("/datapage62.jsp");
			} else if (Sord1.equals("3")) {
				this.render("/datapage63.jsp");
			} else if (Sord1.equals("4")) {
				this.render("/datapage64.jsp");
			} else if (Sord1.equals("5")) {
				this.render("/datapage65.jsp");
			}
		} else if (Sord.equals("7") && permission.charAt(1) == '1') {
			if (Sord1.equals("1")) {
				this.render("/datapage71.jsp");
			} else if (Sord1.equals("2")) {
				this.render("/datapage72.jsp");
			} else if (Sord1.equals("3")) {
				this.render("/datapage73.jsp");
			} else if (Sord1.equals("4")) {
				this.render("/datapage74.jsp");
			}
		} else if (Sord.equals("8") && permission.charAt(2) == '1') {
			if (Sord1.equals("1")) {
				this.render("/datapage81.jsp");
			} else if (Sord1.equals("2")) {
				this.render("/datapage82.jsp");
			} else if (Sord1.equals("3")) {
				this.render("/datapage83.jsp");
			}
		} else if (Sord.equals("9") && permission.charAt(3) == '1') {
			if (Sord1.equals("1")) {
				this.render("/datapage91.jsp");
			} else if (Sord1.equals("2")) {
				this.render("/datapage92.jsp");
			} else if (Sord1.equals("3")) {
				this.render("/datapage93.jsp");
			}
		} else if (Sord.equals("0") && Sord.equals("0")) {
			this.render("/datapage1.jsp");
		} else {
			// 无权限做此操作;
			System.out.println(username + " 此用户无权进行此操作");
			// 返回界面,进行提示;
			this.setAttr("permissionverify", "false");
			this.render("/datapage1.jsp");
		}

		/*
		 * if(this.getPara(0).equals("1")){ this.render("/maincontent.jsp");
		 * }else if(this.getPara(0).equals("2")){
		 * this.render("/maincontent2.jsp"); }else
		 * if(this.getPara(0).equals("3")){ this.render("/maincontent3.jsp"); }
		 */
	}

	public void getData() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// 初始化类;
		PrepareData pa = new PrepareData();
		// 初始化结果;
		String jsondata = "";

		// 获取参数;
		int page = Integer.parseInt(this.getPara("page"));
		int rows = Integer.parseInt(this.getPara("rows"));
		int Sort = Integer.parseInt(this.getPara(0));
		int Sort1 = Integer.parseInt(this.getPara(1));
		String tempsidx = this.getPara("sidx");
		String sord = this.getPara("sord");

		// 排序;
		if (!tempsidx.equals("")) {
			String sidx = MessageParsing.captureName(tempsidx);
			jsondata += pa.getTableData("FrameData", page, rows, Sort, Sort1, sidx, sord);
		}
		// 不排序;
		else {
			jsondata += pa.getTableData("FrameData", page, rows, Sort, Sort1);
		}

		this.renderJson(JSONObject.fromObject(jsondata));
	}

	public void getTableShowData() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// 初始化类;
		PrepareData pa = new PrepareData();
		// 初始化结果;
		String jsondata = "";

		// 获取参数;

		int Sort = Integer.parseInt(this.getPara(0));
		int Sort1 = Integer.parseInt(this.getPara(1));
		// type==1,带最大最小值,type==0,不带最大最小值;
		int type = Integer.parseInt(this.getPara(2));

		jsondata += pa.getTableShowData("FrameData", 1, 1, Sort, Sort1, type);

		this.renderJson(JSONObject.fromObject(jsondata));
	}

	public void getiniData() {
		System.out.println("1111111111111111");
		int value = 200;
		String data = "[{\"value\":\"" + value + "\"}]";
		// System.out.println(JSONObject.fromObject(data));
		System.out.println(data);
		// this.renderJson(data);
		this.renderText(data);
	}

	public void getDatatest() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		// 初始化类;
		PrepareData pa = new PrepareData();
		// 初始化结果;
		String jsondata = "";

		jsondata += getTableData("FrameData", 0, 10);

		this.renderJson(JSONObject.fromObject(jsondata));
	}

	public String getTableData(String DataTable, int page, int rows) throws NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 传过来的参数 page 是从1开始的,所以要减一;
		page -= 1;
		// 准备数据;
		List<?> framelist = MyHibernate.sqlQuery(page * rows, rows, "from " + DataTable);
		List<?> list = MyHibernate.sqlQuery(0,300,"from Parameter");

		// 计算一共有多少列;
		int totalnum = (int) MyHibernate.sqlGetRecordNum("select count(*) from " + DataTable);
		int totalpage = 0;
		if (totalnum % rows == 0) {
			totalpage = totalnum / rows;
		} else {
			totalpage = totalnum / rows + 1;
		}
		String ans = "";
		// 初始化数据头;
		// 返回的时候要对page+1 不然翻页按钮无效果;
		ans += "{\"page\":\"" + (page + 1) + "\"," + " \"total\":\"" + totalpage + "\"," + " \"records\":\"" + rows
				+ "\"," + " \"rows\":" + " [";

		// 填充数据;
		for (int i = 0; i < rows; i++) {
			FrameData frame = (FrameData) framelist.get(i);
			Class<? extends FrameData> myclass = frame.getClass();
			ans += " {" + " \"id\":\"" + i + "\"," + " \"cell\":" + " [";
			// 添加星上时间信息;
			ans += "\"" + frame.getYsj023() + "\"," + "\"" + frame.getYsj024() + "\",";
			// 添加其余信息;
			int jj=0;
			for (int j = 0; j < list.size(); j++) {
				Parameter parameter = (Parameter) list.get(j);
				// System.out.println(""+parameter.getNumber()+" "
				// +parameter.getName()+" "+parameter.getCname());
				if((parameter.getSort()==6&&parameter.getSort1()==4)||(parameter.getSort()==7&&parameter.getSort1()==1)){
					ans += "\"";
					Method m = (Method) myclass.getMethod("get" + DataOpration.captureName(parameter.getName()));
					ans += "" + (m.invoke(frame));
					ans += "\",";
				}
			}
			ans += "]" + " },";

		}
		ans += " ],";
		ans += " \"userdata\":{\"amount\":3220,\"tax\":342,\"total\":3564,\"name\":\"Totals:\"}" + " }";

		// System.out.println(ans);

		return ans;
	}
}
