package com.java.chap05.sec02;

/**
 * Java�����ࣺString VS StringBuffer
 * String����String���͵Ķ����������ͬ����������һ���¶���Ȼ������ָ������
 * StringBuffer����StringBuffer���͵Ķ��������������ʼ����ͬһ������
 * ������ַ������ݲ������ٱ仯��ʹ��StringЧ�ʸߣ�������ַ������ݾ����䶯����StringBuffer��
 *
 */
public class TestString {
	
	public static void main(String[] args) {
		String str = "123";
		str += "abc";
		System.out.println(str);
	}

}
