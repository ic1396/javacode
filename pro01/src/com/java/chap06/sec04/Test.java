package com.java.chap06.sec04;

/**
 * ���ͷ���
 * ����ֵ�Ͳ������÷��ͱ�ʾ�ķ�����
 *
 */
public class Test {
	
	public static <T> void f(T t){
		
		System.out.println("T�������ǣ�" + t.getClass().getName());
	}
	
	public static void main(String[] args) {
		
		f(" ");
		f(1);
		f(1.0f);
		f(1.0);
		f(new Object());
	}

}
