package com.java.chap07.sec03;

import java.lang.reflect.Constructor;

/**
 * ��ȡ���еĹ��췽��
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
			System.out.println("���췽����" + con);
		}
	}

}
