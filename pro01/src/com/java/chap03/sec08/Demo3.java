package com.java.chap03.sec08;

/**
 * String对象
 * 两种实例化方式的区别
 * 直接赋值  和  new
 *
 */
public class Demo3 {
	
	public static void main(String[] args) {
		
		String name1 = "李四";
		String name2 = "李四";
		String name3 = new String("李四");
		String name4 = new String("李四");
		
		System.out.println("name1==name2: " + (name1 == name2));
		System.out.println("name1==name3: " + (name1 == name3));
		System.out.println("name3==name4: " + (name3 == name4));
	}

}
