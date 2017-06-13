package com.java.chap03.sec12;

public class Test2 extends C implements D{

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

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("b方法");		
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.a();
		t.b();
		t.c();
		t.d();
		System.out.println(Test.TITLE);
		System.out.println(Test.TITLE1);
	}

}
