package com.java.chap02;

public class Demo03 {
	
	public static void main(String[] args) {
		//����һ�������ַ�
		char c1='A';
		char c2='b';
		char c3='3';
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		
		//����ת���ַ�
		char c4='\'';
		char c5='\\';
		System.out.println("c4="+c4);
		System.out.println("c5="+c5);
		
		//��Unicode��������Լ�������---���
		char c6='\u7f16';  //��
		char c7='\u7801';  //��
		char c8='\u8868';  //��
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
	}

}
