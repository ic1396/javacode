package com.java.chap03.sec07;

/**
 * ����죺��չ���������ܣ�ÿ��ʵ�������󶼻�ִ�й����������ݡ�
 *
 */
public class Demo2 {
	
	/*
	 * �����
	 */
	{
		System.out.println("ͨ�ù����");
	}
	/*
	 * ���캯��һ
	 */
	public Demo2(){
		System.out.println("���캯��һ");
	}
	/*
	 * ���캯����
	 */
	public Demo2(int i){
		System.out.println("���캯����");
	}
	/*
	 * ���캯����
	 */
	public Demo2(int i, int j){
		System.out.println("���캯����");
	}
	
	public static void main(String[] args) {
		new Demo2();   //��������
		new Demo2(1);   //��������
		new Demo2(1, 2);   //��������
	}

}
