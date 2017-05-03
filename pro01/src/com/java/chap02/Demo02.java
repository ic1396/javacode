package com.java.chap02;

public class Demo02 {
	
	/**
	 * main alt+/ 自动提示
	 * @param args
	 */
	public static void main(String[] args) {
		
		//定义一个float类型变量
		//小数默认为double类型，必须在后面加一个f，表示float类型
		float f=0.1f;
		System.out.println("f="+f);
		
		double d=1.2;
		//快捷方式 syso alt+/
		System.out.println("d="+d);
		
		//将float的最大值输出
		float maxF=Float.MAX_VALUE;
		System.out.println("float类型的最大值="+maxF);
		
		//将float的最大值输出
		float minF=Float.MIN_VALUE;
		System.out.println("float类型的最小值="+minF);
	}
}
