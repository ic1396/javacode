package com.java.chap07.sec01;

import java.lang.reflect.Constructor;

/**
 * getConstructors����
 *
 */
public class Test04 {
	
/**
 * �����в����Ĺ��췽��
 */
public static void main(String[] args) {
		
		Class<?> c = null;
		
		try {
			c = Class.forName("com.java.chap07.sec01.Student");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Student s = null;
		Constructor<?>[] cons = c.getConstructors();
		try {
			s = (Student)cons[0].newInstance("����",40);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(s.toString());
	}

}
