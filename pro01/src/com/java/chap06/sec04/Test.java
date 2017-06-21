package com.java.chap06.sec04;

/**
 * 泛型方法
 * 返回值和参数都用泛型表示的方法。
 *
 */
public class Test {
	
	public static <T> void f(T t){
		
		System.out.println("T的类型是：" + t.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		f(" ");
		f(1);
		f(1.0f);
		f(1.0);
		f(new Object());
	}

}
