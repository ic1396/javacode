package com.java.chap07.sec03;


import java.lang.reflect.Method;

/**
 * ��ȡ���еķ���
 *
 */
public class Test2 {
	
	public static void main(String[] args) {
		Class<?> c = null;
		try{
			c = Class.forName("com.java.chap07.sec03.Student");
			System.out.println(c.getName());
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		Method mds[] = c.getMethods();
		for (Method m:mds){
			System.out.println("������" + m);
		}
	}

}
