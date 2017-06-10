package com.java.chap03.sec07;

/**
 * 静态代码块：在代码块{ }前加 static 修饰词，在类加载的时候执行，而且只执行一次
 *
 */
public class Demo3 {
	
	/*
	 * 静态代码块，类加载的时候执行
	 */
	static{
		System.out.println("静态代码块");  //只需要执行一次的代码，比如静态数据、工厂类
	}
	/*
	 * 构造快
	 */
	{
		System.out.println("通用构造快");
	}
	/*
	 * 构造函数一
	 */
	public Demo3(){
		System.out.println("构造函数一");
	}
	/*
	 * 构造函数二
	 */
	public Demo3(int i){
		System.out.println("构造函数二");
	}
	/*
	 * 构造函数三
	 */
	public Demo3(int i, int j){
		System.out.println("构造函数三");
	}
	
	public static void main(String[] args) {
		new Demo3();   //匿名调用
		new Demo3(1);   //匿名调用
		new Demo3(1, 2);   //匿名调用
	}

}
