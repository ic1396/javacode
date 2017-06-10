package com.java.chap03.sec06;

/**
 * 内部类：在类的内部定义的类。可以方便的使用外部类的属性。但易破坏类的基本结构
 * 谨慎使用！！！
 * @author VM
 *
 */
public class Outer {
	
	private int a = 1;
	
	/**
	 * 内部类
	 *
	 */
	class Inner{
		public void show(){
			System.out.println(a);  //可以方便的使用外部类的属性
		}
	}
	
	public void show(){
		Inner inner = new Inner();
		inner.show();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
	}

}
