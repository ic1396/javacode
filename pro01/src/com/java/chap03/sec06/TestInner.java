package com.java.chap03.sec06;

/**
 * ֱ��ʹ���ڲ���
 * 
 *
 */
public class TestInner {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();  //���ⲿ���������ֱ�Ӷ���һ���ڲ������
		inner.show();
	}

}
