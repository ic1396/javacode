package com.java.chap02;

public class Demo07 {
	public static void main(String[] args) {
		int a=10;
		int b=3;
		// + 运算符
		System.out.println(a+"+"+b+"="+(a+b)); //注意是(a+b)，这里要考虑运算符的优先级，没有小括号就变成了字符串连接
		// - 运算符
		System.out.println(a+"-"+b+"="+(a-b)); //注意是(a-b)，这里要考虑运算符的优先级，没有小括号就变成了字符串连接
		// * 运算符
		System.out.println(a+"*"+b+"="+(a*b)); //注意是(a*b)，这里要考虑运算符的优先级，没有小括号就变成了字符串连接
		// / 运算符
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"/"+b+"="+(10.0/b)); //注意是(a/b)，这里要考虑运算符的优先级，没有小括号就变成了字符串连接
		// % 运算符
		System.out.println(a+"%"+b+"="+(a%b)); //注意是(a/b)，这里要考虑运算符的优先级，没有小括号就变成了字符串连接
	}

}
