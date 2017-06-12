package com.java.chap03.sec09;

/**
 * Java只支持单继承
 * 私有方法不能继承
 * 动物类
 *
 */
public class Animal {
	
	private String name;  //姓名
	private int age;  //年龄
	
	/**
	 * 无参数父类构造函数
	 */
	public Animal(){
		System.out.println("无参数父类构造函数");
	}
	
	/**
	 * @param name  //姓名
	 * @param age   //年龄
	 */
	public Animal(String name, int age) {
		System.out.println("有参数父类构造函数");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void say(){
		System.out.println("我是一个动物，我叫：" + this.name + "，我的年龄是：" + this.age);
		//System.out.println("我是一个动物，我叫：" + this.getName() + "，我的年龄是：" + this.getAge());
	}
	

}
