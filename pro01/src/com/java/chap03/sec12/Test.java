package com.java.chap03.sec12;

/**
 * 
 */
public class Test extends C implements A, B{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("a方法");
	}
	
	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("b方法");		
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.a();
		t.b();
		t.c();
		System.out.println(Test.TITLE);
		System.out.println(Test.TITLE1);
	}

}
