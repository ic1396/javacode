package com.java.chap03.sec07;

/**
 * ��̬����飺�ڴ����{ }ǰ�� static ���δʣ�������ص�ʱ��ִ�У�����ִֻ��һ��
 *
 */
public class Demo3 {
	
	/*
	 * ��̬����飬����ص�ʱ��ִ��
	 */
	static{
		System.out.println("��̬�����");  //ֻ��Ҫִ��һ�εĴ��룬���羲̬���ݡ�������
	}
	/*
	 * �����
	 */
	{
		System.out.println("ͨ�ù����");
	}
	/*
	 * ���캯��һ
	 */
	public Demo3(){
		System.out.println("���캯��һ");
	}
	/*
	 * ���캯����
	 */
	public Demo3(int i){
		System.out.println("���캯����");
	}
	/*
	 * ���캯����
	 */
	public Demo3(int i, int j){
		System.out.println("���캯����");
	}
	
	public static void main(String[] args) {
		new Demo3();   //��������
		new Demo3(1);   //��������
		new Demo3(1, 2);   //��������
	}

}
