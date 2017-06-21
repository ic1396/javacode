package com.java.chap06.sec01;

/**
 * Test C1 C2
 *
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		C1 c1 = new C1(1);
		c1.print();
		
		int i = c1.getA();
		System.out.println("i = " + i);
		
		C2 c2 = new C2("Hello");
		c2.print();
		
		String s = c2.getA();
		System.out.println("s = " + s);
	}

}
