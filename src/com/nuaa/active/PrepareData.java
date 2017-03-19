package com.nuaa.active;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.nuaa.entiy.FrameData;
import com.nuaa.entiy.MyHibernate;
import com.nuaa.entiy.Parameter;
import com.nuaa.test.TestHibernate;

public class PrepareData {
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

	public String getTableData(String DataTable, int page, int rows, int Sort, int Sort1, String sidx, String sord)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		PrepareData pa = new PrepareData();
		String com = DataTable + " order by " + sidx + " " + sord;
		return pa.getTableData(com, page, rows, Sort, Sort1);
	}

	public static void main(String[] argv) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		PrepareData pa = new PrepareData();
		pa.getTableData("FrameData", 1, 10, 1, 0);
	}
}
