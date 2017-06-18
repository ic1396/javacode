package com.java.chap05.sec01;

import java.util.Calendar;

/**
 * Calendar：日历类，在 java.util 包中，能获取到年、月、日、时、分、秒的具体值。
 *
 */
public class TestCalendar {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println((calendar.get(Calendar.MONTH) + 1));
		
		System.out.println("现在是：" + calendar.get(Calendar.YEAR) + "年" 
		+ ((calendar.get(Calendar.MONTH) + 1)) + "月" 
		+ calendar.get(Calendar.DAY_OF_MONTH) + "日"
		+ calendar.get(Calendar.HOUR_OF_DAY) + "时"
		+ calendar.get(Calendar.MINUTE) + "分"
		+ calendar.get(Calendar.SECOND) + "秒");  //Calendar.MONTH
	}

}
