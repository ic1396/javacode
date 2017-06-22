package com.java.chap07.sec01;

/**
 * newInstance·½·¨
 *
 */
public class Test03 {
	
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
		try {
			s = (Student)c.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		s.setName("weijfoifo");
		s.setAge(29);
		System.out.println(s.toString());
	}
	
}
