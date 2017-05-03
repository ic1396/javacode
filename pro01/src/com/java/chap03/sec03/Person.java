package com.java.chap03.sec03;

/**
 * @author yush
 *
 */
public class Person {
	
	void speak(){
		System.out.println("我是张三");
	}
	public static void main(String[] args) {
		Person person=new Person();
		person.speak();
	}

}
