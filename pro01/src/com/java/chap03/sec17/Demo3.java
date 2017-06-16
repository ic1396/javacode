package com.java.chap03.sec17;

/**
 * 包装类的作用：包装类是类类型，jdk中提供了很多有用的方法。
 *
 */
public class Demo3 {
	
	public static void main(String[] args) {
		String a = "3";
		String b = "5";
		int m = Integer.valueOf(a);
		int n = Integer.valueOf(b);
		System.out.println("a + b = " + (m + n));
	}

}
