package com.java.chap05.sec02;

public class TestStringBuffer {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("123");
		sb.append("abc");
		System.out.println(sb.toString());
		//System.out.println(sb);   //Ĭ�ϵ��÷���toString()
	}

}
