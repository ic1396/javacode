package com.java.chap06.sec01;

/**
 * 泛型
 * 定义：使用泛型可以指代任意对象类型
 *
 */
public class C1 {
	
	private Integer a;

	public C1(Integer a) {
		super();
		this.a = a;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}
	
	public void print(){
		System.out.println("a的类型是：" + a.getClass().getName());
	}

}
