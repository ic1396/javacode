package com.java.chap03.sec07;

/**
 * �������Ҫ����ͨ�� { } (������)�������Ĵ���.
 * �������Ҫ��Ϊ��ͨ����顢����졢��̬����顢ͬ������顣
 *
 */
public class Demo1 {
	
	public static void main(String[] args) {
		int a = 1;
		/*
		 * ��ͨ�����
		 */
		{
			a = 2;
			System.out.println("��ͨ�����");
		}
		System.out.println("a=="+a);
	}

}
