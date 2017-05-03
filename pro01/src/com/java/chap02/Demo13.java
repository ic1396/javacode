package com.java.chap02;

//import java.util.*  //2引入包中所有模块
import java.util.Scanner;

public class Demo13 {
	
	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		//定义一个系统输入对象
		//自动导包 ctrl+shift+o
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.close();
		switch(n){
			case 1:{
				System.out.println("输入1");
				break;
			}
			case 2:{
				System.out.println("输入2");
				break;
			}
			default:{
				System.out.println("输入其他数字");
			}
		}
	}

}
