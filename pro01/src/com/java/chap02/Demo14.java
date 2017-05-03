package com.java.chap02;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		System.out.println("请输入：");
		//定义一个系统输入对象
		//自动导包 ctrl+shift+o
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		scanner.close();
		switch(str){
			case "张三":{
				System.out.println("输入的是张三");
				break;
			}
			case "李四":{
				System.out.println("输入的是李四");
				break;
			}
			default:{
				System.out.println("输入的是其他字符串");
				break;
			}
		}
	}

}
