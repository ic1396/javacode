package com.java.chap03.sec03;

/**
 * @author yushVM
 *
 */
public class Person4 {
	
	/**
	 * @param name  ����
	 * @param age   ����
	 * @param hobbies   ����
	 */
	void speak(String name,int age,String ...hobbies){
		System.out.println("����"+name+", �ҽ���"+age+"�ꡣ");
		for(String hobby:hobbies){
			System.out.print(hobby+" ");
		}
	}
	public static void main(String[] args) {
		Person4 zhangsan=new Person4();
		zhangsan.speak("����",30,"sing","swim","dance");
	}
}
