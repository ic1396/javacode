package com.java.chap04.sec01;

/**
 * 异常：程序在执行过程中出现意外。
 * 出现异常后程序不能继续执行。
 *
 */
public class ExceptionDemo {
	
	public static void main(String[] args) {
		String str = "123a";
		int a = Integer.parseInt(str);
		System.out.println(a);
	}

}
