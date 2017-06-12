package com.java.chap03.sec09;

/**
 * 子类重载父类方法
 * 重写时方法名相同
 *
 */
public class Cat extends Animal{
	
	public void say(){
		System.out.println("我是一只猫，我叫：" + this.getName() + "，我的年龄是：" + this.getAge());
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("Mini");
		cat.setAge(2);
		cat.say();
	}

}
