package com.java.chap02;

public class Demo02 {
	
	/**
	 * main alt+/ �Զ���ʾ
	 * @param args
	 */
	public static void main(String[] args) {
		
		//����һ��float���ͱ���
		//С��Ĭ��Ϊdouble���ͣ������ں����һ��f����ʾfloat����
		float f=0.1f;
		System.out.println("f="+f);
		
		double d=1.2;
		//��ݷ�ʽ syso alt+/
		System.out.println("d="+d);
		
		//��float�����ֵ���
		float maxF=Float.MAX_VALUE;
		System.out.println("float���͵����ֵ="+maxF);
		
		//��float�����ֵ���
		float minF=Float.MIN_VALUE;
		System.out.println("float���͵���Сֵ="+minF);
	}
}
