package com.java.chap03.sec03;

/**
 * @author yush
 * 方法返回值例子
 */
public class Person6 {
	
	/**
	 * @param name 名字
	 * @param age  年龄
	 * @param hobbies  爱好
	 * @return  返回爱好的个数
	 */
	int speak(String name,int age,String ...hobbies){
		System.out.println("我是"+name+", 我今年"+age+"岁。");
		for(String hobby:hobbies){
			System.out.print(hobby+" ");
		}
		int totalHobbies=hobbies.length;
		return totalHobbies;
	}
	public static void main(String[] args) {
		Person6 zhangsan=new Person6();
		int n=zhangsan.speak("张三",30,"sing","swim","dance");
		System.out.println("有"+n+"个爱好");
	}
}
