/**
 * �������Ͳ���
 */
package com.java.chap02;

/**
 * Demo1
 * @author yush
 *
 */
public class Demo01 {
	
	public static void main(String args[]){
		//����һ��int�ͱ���
		int a1;
		//
		a1=1;
		System.out.println("a1="+a1);
		
		//����һ��int�ͱ���
		int a2=2;
		System.out.println("a2="+a2);
		
		//����һ��byte�ͱ���
		byte b=3;
		System.out.println("b="+b);
		
		//����һ��short�ͱ���
		short s=4;
		System.out.println("s="+s);
		
		//����һ��long�ͱ���
		long l=5;
		System.out.println("l="+l);
		
		int a11=1;
		int a22=2;
		int a3=a11+a22;
		System.out.println("a3="+a3);
		
		//long���Ͳ���ת��Ϊint��
		a3=a1+a2+b+s+5;
		System.out.println("a3="+a3);
	}

}
