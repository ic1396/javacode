package com.java.chap03.sec06;

/**
 * �ڲ��ࣺ������ڲ�������ࡣ���Է����ʹ���ⲿ������ԡ������ƻ���Ļ����ṹ
 * ����ʹ�ã�����
 * @author VM
 *
 */
public class Outer {
	
	private int a = 1;
	
	/**
	 * �ڲ���
	 *
	 */
	class Inner{
		public void show(){
			System.out.println(a);  //���Է����ʹ���ⲿ�������
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
