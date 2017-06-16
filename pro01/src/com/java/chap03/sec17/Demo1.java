package com.java.chap03.sec17;

/**
 * 包装类
 * 每个基本类型都有一个对应的类，就是所谓的包装类。
 * 基本类型                包装类
 * int        Interger
 * char       Character
 * short      Short
 * long       Long
 * float      Float
 * double     Double
 * boolean    Boolean
 * byte       Byte
 * 装箱和拆箱：基本类型和类类型可以相互转换。
 * 装箱：基本类型到类类型的转换叫做装箱。
 * 拆箱：类类型到基本类型的转换叫做拆箱。
 * 自动装箱和拆箱：在类类型和基本类型的转换中，是自动转换的，无需强制类型转换。
 * 包装类的作用：包装类是类类型，jdk中提供了很多有用的方法。
 * 
 * 
 */
public class Demo1 {
	
	public static void main(String[] args) {
		
		int a = 1;
		Integer i = new Integer(a);  //装箱
		int b = i.intValue();        //拆箱
		System.out.println("a = " + a);
		System.out.println("i = " + i);
		System.out.println("b = " + b);
	}

}
