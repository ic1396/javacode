package com.java.chap03.sec03;

public class Person3 {
	
	/**
	 * @param name  ����
	 * @param age   ����
	 */
	void speak(String name,int age){
		System.out.println("����"+name+", �ҽ���"+age+"�ꡣ");
	}
	public static void main(String[] args) {
		Person3 zhangsan=new Person3();
		zhangsan.speak("����",30);
	}
}
