package com.java.chap02;

public class Demo08 {
	public static void main(String[] args) {
		
		int a1=1;
		int b1=a1++;  // a1++ ��ʾ������ֵ������������
		System.out.println("b1="+b1);
		System.out.println("a1="+a1);
		System.out.println("==================");
		int a2=1;
		b1=++a2;  // ++a2 ��ʾ����������������ֵ
		System.out.println("b1="+b1);
		System.out.println("a2="+a2);
		System.out.println("==================");
		
		a1=1;
		b1=a1--;  // a1++ ��ʾ������ֵ���������Լ�
		System.out.println("b1="+b1);
		System.out.println("a1="+a1);
		System.out.println("==================");
		a2=1;
		b1=--a2;  // ++a2 ��ʾ�����Լ���������ֵ
		System.out.println("b1="+b1);
		System.out.println("a2="+a2);
		System.out.println("==================");
	}

}
