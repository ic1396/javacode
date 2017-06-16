package com.java.chap03.sec17;

/**
 * 自动装箱和拆箱：在类类型和基本类型的转换中，是自动转换的，无需强制类型转换。
 *
 */
public class Demo2 {
	
	public static void main(String[] args) {
		
		Integer i = 1;  //自动装箱的过程，自动把基本类型转换成类类型
		int i1 = i;     //自动拆箱的过程，
		System.out.println("i = " + i);
		System.out.println("i1 = " + i1);
	}

}
