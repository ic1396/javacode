package com.java.chap03.sec17;

/**
 * ��װ��
 * ÿ���������Ͷ���һ����Ӧ���࣬������ν�İ�װ�ࡣ
 * ��������                ��װ��
 * int        Interger
 * char       Character
 * short      Short
 * long       Long
 * float      Float
 * double     Double
 * boolean    Boolean
 * byte       Byte
 * װ��Ͳ��䣺�������ͺ������Ϳ����໥ת����
 * װ�䣺�������͵������͵�ת������װ�䡣
 * ���䣺�����͵��������͵�ת���������䡣
 * �Զ�װ��Ͳ��䣺�������ͺͻ������͵�ת���У����Զ�ת���ģ�����ǿ������ת����
 * ��װ������ã���װ���������ͣ�jdk���ṩ�˺ܶ����õķ�����
 * 
 * 
 */
public class Demo1 {
	
	public static void main(String[] args) {
		
		int a = 1;
		Integer i = new Integer(a);  //װ��
		int b = i.intValue();        //����
		System.out.println("a = " + a);
		System.out.println("i = " + i);
		System.out.println("b = " + b);
	}

}
