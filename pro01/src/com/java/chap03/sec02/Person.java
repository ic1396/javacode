package com.java.chap03.sec02;

/**
 * Person类    文件名和类名必须一致
 * @author yushVM
 *
 */
public class Person {
	
	String name; //在类中,定义一个姓名name字符串属性,可以存放字符串"张三"
	int age;   //在类中,定义一个年龄age整形属性
	
	public void speak(){
		System.out.println("我叫"+name+", 我今年"+age+"岁。");
	}
	public static void main(String[] args) {
		//定义一个Person类的对象
		Person zhangsan;
		//实例化一个对象
		zhangsan=new Person();
		zhangsan.name="张三";  //为属性赋值
		zhangsan.age=89;
		zhangsan.speak();
	}
}
