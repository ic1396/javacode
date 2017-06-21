package com.java.chap06.sec01;

/**
 * Test CC
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		CC<Integer> cc = new CC<Integer>(1);
		cc.print();
		int i = cc.getT();
		System.out.println("i = " + i);
		
		CC<String> cc_s = new CC<String>("Œ“ «∑∫–Õ");
		cc_s.print();
		String s = cc_s.getT();
		System.out.println("s = " + s);
	}

}
