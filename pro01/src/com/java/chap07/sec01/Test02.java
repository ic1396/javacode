package com.java.chap07.sec01;

public class Test02 {
	
	public static void main(String[] args) {
		
		try {
			Class<?> c = Class.forName("com.java.chap07.sec01.Student");
			System.out.println(c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
