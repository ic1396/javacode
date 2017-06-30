package com.java.chap07.sec04;

import java.lang.reflect.Field;

/**
 * 调用反射操作类的私有属性
 *
 */
public class Test2 {
	
	public static void main(String[] args) {
		Class<?> c = null;
		try{
			c = Class.forName("com.java.chap07.sec04.Student");
			System.out.println(c.getName());
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		try {
			Object obj = c.newInstance();
			Field nameField = c.getDeclaredField("name");
			nameField.setAccessible(true); //设置允许访问反射得到的类的私有属性
			nameField.set(obj, "my name is");
			String name = (String)nameField.get(obj);
			System.out.println("name = "+ name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
