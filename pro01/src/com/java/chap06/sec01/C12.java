package com.java.chap06.sec01;

/**
 * ʹ�ö�̬�ķ�ʽʵ��
 *
 */
public class C12 {
	
	private Object object;

	public C12(Object object) {
		super();
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
	public void print(){
		System.out.println("object�������ǣ�" + object.getClass().getName());
	}

}
