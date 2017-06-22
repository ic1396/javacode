package com.java.chap07.sec01;

/**
 * 反射
 * 通常情况下是有一个类定义,通过这个类的定义创建对象，
 * 当需要通过一个的对象（类的实例）找到一个类时，需要用到反射。
 * Java实现反射的核心在包 java.lang 中的 Class类。
 *
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		Student student = new Student("qwe",20);
		System.out.println(student.getClass().getName());
	}

}
