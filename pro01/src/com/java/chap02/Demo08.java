package com.java.chap02;

public class Demo08 {
	public static void main(String[] args) {
		
		int a1=1;
		int b1=a1++;  // a1++ 表示先做赋值操作，后自增
		System.out.println("b1="+b1);
		System.out.println("a1="+a1);
		System.out.println("==================");
		int a2=1;
		b1=++a2;  // ++a2 表示先做自增操作，后赋值
		System.out.println("b1="+b1);
		System.out.println("a2="+a2);
		System.out.println("==================");
		
		a1=1;
		b1=a1--;  // a1++ 表示先做赋值操作，后自减
		System.out.println("b1="+b1);
		System.out.println("a1="+a1);
		System.out.println("==================");
		a2=1;
		b1=--a2;  // ++a2 表示先做自减操作，后赋值
		System.out.println("b1="+b1);
		System.out.println("a2="+a2);
		System.out.println("==================");
	}

}
