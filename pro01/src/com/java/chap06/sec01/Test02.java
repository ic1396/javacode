package com.java.chap06.sec01;

/**
 * Test C12
 *
 */
public class Test02 {
	
	public static void main(String[] args) {
		
		C12 c12 = new C12(1);  //向上转型
		c12.print();
		
		int i = (Integer)c12.getObject();   //向下转型
		System.out.println("i = " + i);
		
		C12 c122 = new C12("Hello");  //向上转型
		c122.print();
		
		String s = (String)c122.getObject();   //向下转型
		System.out.println("s = " + s);
	}

}
