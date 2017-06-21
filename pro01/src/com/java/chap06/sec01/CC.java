package com.java.chap06.sec01;

/**
 * 使用泛型的方式实现
 *
 * @param <T>
 */
public class CC<T> {
	
	private T t;

	public CC(T t) {
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
