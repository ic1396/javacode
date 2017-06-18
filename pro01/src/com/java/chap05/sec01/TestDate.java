package com.java.chap05.sec01;

import java.util.Date;

/**
 * Java常用类：日期处理类
 * Date：jdk提供的标准日期类，在 java.util 包中
 * Calendar：日历类，在 java.util 包中，能获取到年、月、日、时、分、秒的具体值。
 * SimpleDateFormat：日期类型转换，在java.text包中
 *
 */
public class TestDate {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("当前日期：" + date);
	}

}