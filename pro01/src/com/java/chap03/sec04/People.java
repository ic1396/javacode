package com.java.chap03.sec04;

/**
 * 人类
 * @author
 *
 */
public class People {
	
	private String name;     //实例化对象时，默认值是null
	private int age;         //实例化对象时，默认值是0
	
	/**
	 * 默认构造函数，无参数
	 * 构造函数没有返回值，构造函数名与类名相同，可重载，一个类可具有多个构造函数
	 * 未定义任何构造函数时，编译器自动生成一个默认的无参数的构造函数
	 * 若定义构造函数时，编译器不会自动生成一个默认的无参数的构造函数
	 * 在程序中没有明确定义，直接调用默认的无参数的构造函数会报错
	 */
	People(){
		System.out.println("默认构造函数");
	}
	
	/**
	 * 带参数的构造函数
	 * @param myName
	 * @param myAge
	 */
	People(String myName, int myAge){
		this();    //调用无参数的构造方法，必须放在构造函数的第一行
		System.out.println("带参数构造函数");
		name = myName;
		age = myAge;
	}
	
	/**
	 * 作用域  和  this 关键字
	 * this 表示  当前对象
	 * 可使用this调用本类中的属性、构造方法
	 * @param name
	 * @param age
	 */
/*	People(String name, int age){
		System.out.println("带参数构造函数");
		this.name = name;
		this.age = age;
	}*/
	public void say(){
		System.out.println("我是" + name + "，我今年" + age + "岁。");
	}
	
	public static void main(String[] args) {
		/*People zhangsan = new People();
		zhangsan.say();*/
		People lisi = new People("李四", 20);
		lisi.say();
	}

}
