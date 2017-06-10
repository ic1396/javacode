package com.java.chap03.sec06;

/**
 * 直接使用内部类
 * 
 *
 */
public class TestInner {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();  //在外部类对象外面直接定义一个内部类对象
		inner.show();
	}

}
