package com.java.chap06.sec01;

/**
 * ����
 * ���壺ʹ�÷��Ϳ���ָ�������������
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
		System.out.println("a�������ǣ�" + a.getClass().getName());
	}

}
