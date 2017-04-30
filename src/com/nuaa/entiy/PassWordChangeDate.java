package com.nuaa.entiy;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PassWordChangeDate {
	private String userName;
	private Date changeDate;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	/**
	 *  返回true 表示修改密码日期为正常,不需要强制修改密码;
	 *  返回false 表示需要强制修改密码;
	 * */
	public boolean JudgeTime(User user) {
		List<?> list = MyHibernate.sqlQuery(0, 20, "from PassWordChangeDate");
		int i = 0;
		for (i = 0; i < list.size(); i++) {
			if (((PassWordChangeDate) list.get(i)).getUserName().equals(user.getUserName())) {
				break;
			}
		}
		if (i == list.size())
			return false;

		PassWordChangeDate pcd = (PassWordChangeDate) list.get(i);
		if (ChangeDays(pcd.getChangeDate()) > 30)
			return false;
		else
			return true;
	}

	/**
	 * 返回两个Date之间相差天数;
	 * */
	private int ChangeDays(Date date) {
		Date curdate = new Date();
		Calendar aCalendar = Calendar.getInstance();
		aCalendar.setTime(date);
		int day1 = aCalendar.get(Calendar.DAY_OF_YEAR);
		aCalendar.setTime(curdate);
		int day2 = aCalendar.get(Calendar.DAY_OF_YEAR);
		return day2 - day1;
	}
}
