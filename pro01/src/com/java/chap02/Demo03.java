package com.java.chap02;

public class Demo03 {
	
	public static void main(String[] args) {
		//定义一个单个字符
		char c1='A';
		char c2='b';
		char c3='3';
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		
		//定义转义字符
		char c4='\'';
		char c5='\\';
		System.out.println("c4="+c4);
		System.out.println("c5="+c5);
		
		//用Unicode编码输出自己的名字---查表
		char c6='\u7f16';  //编
		char c7='\u7801';  //码
		char c8='\u8868';  //表
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
	}

}
