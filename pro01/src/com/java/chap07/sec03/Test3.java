package com.java.chap07.sec03;

import java.lang.reflect.Field;

/**
 * 获取所有的属性
 *
 */
public class Test3 {
	
	public static void main(String[] args) {
		Class<?> c = null;
		try{
			c = Class.forName("com.java.chap07.sec03.Student");
			System.out.println(c.getName());
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		Field fs[] = c.getDeclaredFields();
		for (Field f:fs){
			System.out.println("属性：" + f);
		}
	}

}
