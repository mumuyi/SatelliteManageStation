package com.nuaa.active;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.nuaa.entiy.FrameData;
import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.Parameter;
import com.nuaa.test.TestHibernate;

public class PrepareData {
	/**
	 * 按格式获取历史记录查询的数据;
	 * 
	 * DataTable 查询的表;
	 * page 查询数据的页数;
	 * rows 一页所需显示数据条数;
	 * Sort 数据类别;
	 * Sort1 数据类别1;
	 * 
	 * Sort 和Sort1 用以从parameter 表中获取当前表格所需显示的属性集合,再用回调的方法实现获取具体数据;
	 * */
	public String getTableData(String DataTable, int page, int rows, int Sort, int Sort1) throws NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 传过来的参数 page 是从1开始的,所以要减一;
		page -= 1;
		// 准备数据;
		List<?> framelist = MyHibernate.sqlQuery(page * rows, rows, "from " + DataTable);
		List<?> list = MyHibernate.sqlQueryWithCondition("from Parameter where Sort=? and Sort1=?", "" + Sort,
				"" + Sort1);

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
		//返回的时候要对page+1 不然翻页按钮无效果;
		ans += "{\"page\":\"" + (page+1) + "\"," + " \"total\":\"" + totalpage + "\"," + " \"records\":\"" + rows + "\","
				+ " \"rows\":" + " [";

		// 填充数据;
		for (int i = 0; i < rows; i++) {
			FrameData frame = (FrameData) framelist.get(i);
			Class<? extends FrameData> myclass = frame.getClass();
			ans += " {" + " \"id\":\"" + i + "\"," + " \"cell\":" + " [";
			//添加星上时间信息;
			ans += "\""+frame.getYsj023()+"\","+"\""+frame.getYsj024()+"\",";
			//添加其余信息;
			for (int j = 0; j < list.size(); j++) {
				Parameter parameter = (Parameter) list.get(j);
				// System.out.println(""+parameter.getNumber()+" "
				// +parameter.getName()+" "+parameter.getCname());
				ans += "\"";
				Method m = (Method) myclass.getMethod("get" + TestHibernate.captureName(parameter.getName()));
				ans += "" + (m.invoke(frame));

				if (j == list.size() - 1) {
					ans += "\"";
				} else {
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

	/**按格式获取历史记录查询的数据且实现排序;
	 * 
	 * sidx 所需排序的列的名称;
	 * sord 排序方式,desc或者acs;
	 * */
	public String getTableData(String DataTable, int page, int rows, int Sort, int Sort1, String sidx, String sord)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		PrepareData pa = new PrepareData();
		String com = DataTable + " order by " + sidx + " " + sord;
		return pa.getTableData(com, page, rows, Sort, Sort1);
	}

	/**
	 * 测试函数;
	 * */
	public static void main(String[] argv) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		PrepareData pa = new PrepareData();
		pa.getTableData("FrameData", 1, 10, 1, 0);
	}
	
	/**
	 * 按格式获取实时显示数据的表格形式数据;
	 * 
	 * type==0 时,带最大值最小值;
	 * type==1时,不带最大最小值;
	 * */
	public String getTableShowData(String DataTable, int page, int rows, int Sort, int Sort1,int type) throws NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 传过来的参数 page 是从1开始的,所以要减一;
		page -= 1;
		// 准备数据;
		List<?> framelist = MyHibernate.sqlQuery(page * rows, rows, "from " + DataTable);
		List<?> list = MyHibernate.sqlQueryWithCondition("from Parameter where Sort=? and Sort1=?", "" + Sort,
				"" + Sort1);
		

		String ans = "";
		// 初始化数据头;
		//返回的时候要对page+1 不然翻页按钮无效果;
		ans += "{\"page\":\"" + 1 + "\"," + " \"total\":\"" + 1 + "\"," + " \"records\":\"" + rows + "\","
				+ " \"rows\":" + " [";
		
		// 填充数据;
		for (int i = 0; i < list.size(); i++) {
			FrameData frame = (FrameData) framelist.get(0);
			Parameter parameter=(Parameter)list.get(i);
			Class<? extends FrameData> myclass = frame.getClass();
			ans += " {" + " \"id\":\"" + i + "\"," + " \"cell\":" + " [";
			//添加参数名称;
			ans+="\""+parameter.getCname()+"\",";
			//添加值;
			ans += "\"";
			Method m = (Method) myclass.getMethod("get" + TestHibernate.captureName(parameter.getName()));
			ans += "" + (m.invoke(frame));
			ans += "\",";
			//添加星上时间信息;
			ans += "\""+frame.getYsj023()+"\","+"\""+frame.getYsj024()+"\"";
			//添加最大值最小值;
			if(type==1){
				ans+=",";
				ans+="\""+parameter.getRangeFrom()+"\",";
				ans+="\""+parameter.getRangeTo()+"\"";
			}
			ans += "]" + " },";
		
		}
		ans += " ],";
		ans += " \"userdata\":{\"amount\":3220,\"tax\":342,\"total\":3564,\"name\":\"Totals:\"}" + " }";
		
		// System.out.println(ans);
		
		return ans;
		}
}
