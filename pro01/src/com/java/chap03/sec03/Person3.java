package com.java.chap03.sec03;

public class Person3 {
	
	/**
	 * @param name  名字
	 * @param age   年龄
	 */
	void speak(String name,int age){
		System.out.println("我是"+name+", 我今年"+age+"岁。");
	}
	public static void main(String[] args) {
		Person3 zhangsan=new Person3();
		zhangsan.speak("张三",30);
	}
}
