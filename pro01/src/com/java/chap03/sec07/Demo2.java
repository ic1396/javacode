package com.java.chap03.sec07;

/**
 * 构造快：扩展构造器功能，每次实例化对象都会执行构造快里的内容。
 *
 */
public class Demo2 {
	
	/*
	 * 构造快
	 */
	{
		System.out.println("通用构造快");
	}
	/*
	 * 构造函数一
	 */
	public Demo2(){
		System.out.println("构造函数一");
	}
	/*
	 * 构造函数二
	 */
	public Demo2(int i){
		System.out.println("构造函数二");
	}
	/*
	 * 构造函数三
	 */
	public Demo2(int i, int j){
		System.out.println("构造函数三");
	}
	
	public static void main(String[] args) {
		new Demo2();   //匿名调用
		new Demo2(1);   //匿名调用
		new Demo2(1, 2);   //匿名调用
	}

}
