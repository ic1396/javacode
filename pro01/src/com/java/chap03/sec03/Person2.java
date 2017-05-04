package com.java.chap03.sec03;

public class Person2 {
	
	void speak(String name){
		System.out.println("我是"+name);
	}
	public static void main(String[] args) {
		Person2 zhangsan=new Person2();
		zhangsan.speak("张三");
	}
}
