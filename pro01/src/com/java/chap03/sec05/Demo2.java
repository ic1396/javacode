package com.java.chap03.sec05;

import com.java.chap03.sec04.People;

/**
 * ��������ʵ��
 * �ؼ��� package �� import
 * ctrl + shift + o �Զ����������ڵİ�
 */
public class Demo2 {
	
	public static void main(String[] args) {
		
		//ͬһ�����ڵ��಻��Ҫ����
		Demo1 demo1 = new Demo1();
		demo1.setA(90);
		System.out.println(demo1.getA());
		
		//û��ָ������Ȩ�޿��ƹؼ���ʱ��Ĭ��Ϊ������Ȩ�ޣ�����������ʹ�ûᱨ��
		//People zhangsan = new People();
		People zhangsan = new People("����", 20);
		zhangsan.say();
		
	}

}
