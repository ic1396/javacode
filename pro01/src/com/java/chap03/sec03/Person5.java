package com.java.chap03.sec03;

/**
 * @author yush
 * ������������
 */
public class Person5 {
	
	void speak(int age){
		System.out.println(" �ҽ���"+age+"�ꡣ");
		age=23;
		
		}
	public static void main(String[] args) {
		Person5 zhangsan=new Person5();
		int age=40;
		zhangsan.speak(age);
		System.out.println(age);
	}
}
