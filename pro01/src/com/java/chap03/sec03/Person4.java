package com.java.chap03.sec03;

/**
 * @author yushVM
 *
 */
public class Person4 {
	
	/**
	 * @param name  名字
	 * @param age   年龄
	 * @param hobbies   爱好
	 */
	void speak(String name,int age,String ...hobbies){
		System.out.println("我是"+name+", 我今年"+age+"岁。");
		for(String hobby:hobbies){
			System.out.print(hobby+" ");
		}
	}
	public static void main(String[] args) {
		Person4 zhangsan=new Person4();
		zhangsan.speak("张三",30,"sing","swim","dance");
	}
}
