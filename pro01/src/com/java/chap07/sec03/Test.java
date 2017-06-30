package com.java.chap07.sec03;

import java.lang.reflect.Constructor;

/**
 * 获取所有的构造方法
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Class<?> c = null;
		try{
			c = Class.forName("com.java.chap07.sec03.Student");
			System.out.println(c.getName());
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		Constructor<?> cons[] = c.getConstructors();
		for (Constructor<?> con : cons){
			System.out.println("构造方法：" + con);
		}
	}

}
