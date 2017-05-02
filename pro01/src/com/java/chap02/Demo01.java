/**
 * 数据类型测试
 */
package com.java.chap02;

/**
 * Demo1
 * @author yush
 *
 */
public class Demo01 {
	
	public static void main(String args[]){
		//定义一个int型变量
		int a1;
		//
		a1=1;
		System.out.println("a1="+a1);
		
		//定义一个int型变量
		int a2=2;
		System.out.println("a2="+a2);
		
		//定义一个byte型变量
		byte b=3;
		System.out.println("b="+b);
		
		//定义一个short型变量
		short s=4;
		System.out.println("s="+s);
		
		//定义一个long型变量
		long l=5;
		System.out.println("l="+l);
		
		int a11=1;
		int a22=2;
		int a3=a11+a22;
		System.out.println("a3="+a3);
		
		//long类型不能转换为int型
		a3=a1+a2+b+s+5;
		System.out.println("a3="+a3);
	}

}
