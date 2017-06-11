package com.java.chap03.sec08;

/**
 * String对象
 * 字符串的内容不可改变
 * 改变内容，只能通过指向一个新的内存地址
 *
 */
public class Demo4 {
	
	public static void main(String[] args) {
		String name = "zhang";
		name += "san";
		System.out.println(name);
	}

}
