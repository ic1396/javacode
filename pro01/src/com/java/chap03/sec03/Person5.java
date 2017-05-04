package com.java.chap03.sec03;

public class Person5 {
	
	void speak(int age){
		System.out.println(" ÎÒ½ñÄê"+age+"Ëê¡£");
		age=23;
		
		}
	public static void main(String[] args) {
		Person5 zhangsan=new Person5();
		int age=40;
		zhangsan.speak(age);
		System.out.println(age);
	}
}
