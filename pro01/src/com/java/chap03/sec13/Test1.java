package com.java.chap03.sec13;

public class Test1 {
	
	public static void main(String[] args) {
		People p1 = new Student();
		p1.say();
		
		p1 = new Teacher();
		p1.say();
	}

}
