package com.java.chap03.sec18;

public class Test {
	
	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();
		Singleton single1 = Singleton.getInstance();
		System.out.println(single == single1);
		
		Singleton2 single2 = Singleton2.getInstance();
		Singleton2 single3 = Singleton2.getInstance();
		System.out.println(single2 == single3);
	}

}
