package com.java.chap06.sec02;

/**
 * ����
 * ���Ʒ������ͣ����Ϳ������������ͣ��������͵�����������һ����Χ�ڸ���ȫ��
 *
 */
public class Demo <T extends Animal>{      //��������������ΪAnimal���ͼ�������
	
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
		System.out.println("t�������ǣ�" + t.getClass().getName());
	}

}
