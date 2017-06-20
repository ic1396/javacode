package com.java.chap05.sec02;

/**
 * Java常用类：String VS StringBuffer
 * String：对String类型的对象操作，等同于重新生成一个新对象，然后将引用指向它。
 * StringBuffer：对StringBuffer类型的对象操作，操作的始终是同一个对象。
 * 定义的字符串内容不变或很少变化，使用String效率高，定义的字符串内容经常变动，用StringBuffer。
 *
 */
public class TestString {
	
	public static void main(String[] args) {
		String str = "123";
		str += "abc";
		System.out.println(str);
	}

}
