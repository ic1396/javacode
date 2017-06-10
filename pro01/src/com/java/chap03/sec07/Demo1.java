package com.java.chap03.sec07;

/**
 * 代码块主要就是通过 { } (花括号)括起来的代码.
 * 代码块主要分为普通代码块、构造快、静态代码块、同步代码块。
 *
 */
public class Demo1 {
	
	public static void main(String[] args) {
		int a = 1;
		/*
		 * 普通代码块
		 */
		{
			a = 2;
			System.out.println("普通代码块");
		}
		System.out.println("a=="+a);
	}

}
