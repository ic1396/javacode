package com.java.chap03.sec05;

import com.java.chap03.sec04.People;

/**
 * 包和引用实例
 * 关键字 package 和 import
 * ctrl + shift + o 自动导入类所在的包
 */
public class Demo2 {
	
	public static void main(String[] args) {
		
		//同一个包内的类不需要导入
		Demo1 demo1 = new Demo1();
		demo1.setA(90);
		System.out.println(demo1.getA());
		
		//没有指定访问权限控制关键字时，默认为包访问权限，在其他包中使用会报错
		//People zhangsan = new People();
		People zhangsan = new People("张三", 20);
		zhangsan.say();
		
	}

}
