package com.java.chap03.sec18;

/**
 * 
 */
public class Singleton2 {
	
	/**
	 * ���췽��˽��
	 */
	private Singleton2(){
		
	}
	//����ʽ
	private static Singleton2 single = null;

	/**
	 * ��ȡʵ��
	 */
	public static Singleton2 getInstance(){
		if (single == null){
			System.out.println("��һ�ε���");
			single = new Singleton2();
		}
		return single;
	}
	
/*	public synchronized static Singleton2 getInstance(){  //���߳�ʱ��Ҫ�������������̵߳ĳ�ͻ
		if (single == null){
			System.out.println("��һ�ε���");
			single = new Singleton2();
		}
		return single;
	}*/

}
