package com.java.chap07.sec04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 调用反射获取的方法
 *
 */
public class Test {
	
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
			Method m1 = obj.getClass().getMethod("setName", String.class); //通过反射获取方法
			m1.invoke(obj, "my_name");  //调用方法
			Method m2 = obj.getClass().getMethod("getName"); //通过反射获取方法
			String name = (String)m2.invoke(obj);
			System.out.println("name = "+ name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
