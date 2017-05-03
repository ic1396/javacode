package com.java.chap02;

public class Demo15 {
	
	public static void main(String[] args) {
		//在控制台输出1到10的整数
		
		//while循环语句
		int i=1;
		while(i<=10){
			System.out.print(i+" ");
			i++;
		}
		System.out.println("===================");
		//do...while
		int j=1;
		do{
			System.out.print(j+" ");
			j++;
		}while(j<=10);
		System.out.println("===================");
		//for
		for(int k=1;k<=10;k++){
			System.out.print(k+" ");
		}
		System.out.println("===================");
		//for循环嵌套
		for(int m=0;m<10;m++){
			for(int n=0;n<10;n++){
				System.out.print("m="+m+",n="+n+" ");
			}
			System.out.println();
		}
	}

}
