package com.java.chap07.sec01;

/**
 * ����
 * ͨ�����������һ���ඨ��,ͨ�������Ķ��崴������
 * ����Ҫͨ��һ���Ķ������ʵ�����ҵ�һ����ʱ����Ҫ�õ����䡣
 * Javaʵ�ַ���ĺ����ڰ� java.lang �е� Class�ࡣ
 *
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		Student student = new Student("qwe",20);
		System.out.println(student.getClass().getName());
	}

}
