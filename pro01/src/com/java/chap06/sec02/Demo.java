package com.java.chap06.sec02;

/**
 * 泛型
 * 限制泛型类型：泛型可以是任意类型，但将泛型的类型限制在一定范围内更安全。
 *
 */
public class Demo <T extends Animal>{      //将泛型类型限制为Animal类型及其子类
	
	private T t;

	public Demo(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public void print(){
		System.out.println("t的类型是：" + t.getClass().getName());
	}

}
