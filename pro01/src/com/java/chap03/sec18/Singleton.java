package com.java.chap03.sec18;

/**
 * ���ģʽ
 * �кܶ����ģʽ������������������ȵȡ�
 * �Ƽ��鼮��Head First���ģʽ��
 * ���ǵ������ģʽʾ����
 * �������ģʽ����javaӦ���У����������ܱ�֤��һ��JVM�У��ö���ֻ��һ��ʵ�����ڡ�
 * �������ģʽ������ʵ�ַ�ʽ��һ���Ƕ���ʽ��һ��������ʽ��
 * 
 */
public class Singleton {
	
	/**
	 * ���췽��˽��
	 */
	private Singleton(){
		
	}
	//����ʽ
	private static final Singleton single = new Singleton();
	
	/**
	 * ��ȡʵ��
	 */
	public static Singleton getInstance(){
		return single;
	}

}
