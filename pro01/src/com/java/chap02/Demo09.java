package com.java.chap02;

public class Demo09 {
	public static void main(String[] args) {
		// && 与  前后两个操作数必须都是true才返回true，否则返回false
		boolean b1=(5<3)&&(5>4);  //有一个警告：dead code
		System.out.println("b1="+b1);
		// & 不短路与
		boolean b2=(5>4)&(5>4);
		System.out.println("b2="+b2);
		//一般用 && 与，效率高
		
		// || 或   只要 前后两个操作数有一个是true就返回true，否则返回false
		boolean b3=(5>4)||(5<4);  //有一个警告：dead code
		System.out.println("b3="+b3);
		// | 不短路或
		boolean b4=(5>4)|(5<4);
		System.out.println("b4="+b4);
		// ! 非  如果有操作数为true，则返回false，否则返回true
		boolean b5=!(5>4);
		System.out.println("b5="+b5);
		// ^ 异或  当两个操作数不相同时返回true，否则返回false
		boolean b6=(5<4)^(4<6);
		System.out.println("b6="+b6);
	}

}
