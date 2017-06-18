package com.java.chap05.sec01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
	
	/**
	 * �����ڶ����ʽ��Ϊָ����ʽ�������ַ���
	 * @param date ��������ڶ���
	 * @param format ��ʽ
	 * @return
	*/
	public static String formatDate(Date date,String format){
		String result = "";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		if(date != null){
			result = sdf.format(date);
		}
		return result;
	}
	
	/**
	 * �������ַ���ת����һ�����ڶ���
	 * @param dateStr �����ַ���
	 * @param format ��ʽ
	 * @return
	 * @throws ParseException
	*/
	public static Date formatDate(String dateStr,String format) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		return sdf.parse(dateStr);
	}
	
	public static void main(String[] args) throws ParseException{
		Date date=new Date();
		System.out.println(formatDate(date,"yyyy-MM-dd"));
		System.out.println(formatDate(date,"yyyy-MM-dd HH:mm:ss"));
		System.out.println(formatDate(date,"yyyy��MM��dd��HHʱmm��ss��"));
		
		String dataStr="1989-11-02 18:01:41";
		Date date2=formatDate(dataStr,"yyyy-MM-dd HH:mm:ss");
		System.out.println(formatDate(date2,"yyyy-MM-dd HH:mm:ss"));
	}
}