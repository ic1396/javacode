package com.java.chap03.sec03;

/**
 * @author yush
 * 方法参数例子
 */
public class Person5 {
	
	void speak(int age){
		System.out.println(" 我今年"+age+"岁。");
		age=23;
		
		}
	public static void main(String[] args) {
		Person5 zhangsan=new Person5();
		int age=40;
		zhangsan.speak(age);
		System.out.println(age);
	}
}
