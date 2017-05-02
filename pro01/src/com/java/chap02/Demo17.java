package com.java.chap02;

import java.util.Scanner;

public class Demo17 {
	
	public static void main(String[] args) {
		/*outer:
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==1){
					//break;//跳出当前循环
					break outer;//跳转至outer
				}
				System.out.print("i="+i+" "+"j="+j+"; ");
			}
			System.out.println();
		}*/	
		/*for(int i=0;i<10;i++){
			if(i==3||i==6){
				continue;//结束当前循环的本次操作
			}
			System.out.print("i="+i+" ");
		}*/
		/*for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==1){
					return;//结束方法执行
				}
				System.out.print("i="+i+" "+"j="+j+"; ");
			}
			System.out.println();
		}*/
		//System.out.println("执行到这里");
		int i=0;
		int j=0;
		int k=0;
		int l=0;
		
		System.out.println("交换两个数字");
		i=3;
		j=5;
		System.out.println("交换前两个数字");
		System.out.println("i="+i+", j="+j);
		
		k=i;
		i=j;
		j=k;
		System.out.println("交换后两个数字");
		System.out.println("i="+i+", j="+j);
		
		System.out.println("求三个数字中的最大值");
		
		System.out.println("输入第一个数字：");
		Scanner scanner=new Scanner(System.in);
		k=scanner.nextInt();
		System.out.println("输入第二个数字：");
		i=scanner.nextInt();
		System.out.println("输入第三个数字：");
		j=scanner.nextInt();
		scanner.close();
		if(k>i){
			if(k>j){
				System.out.println("最大值是"+k);
			}else{
				System.out.println("最大值是"+j);
			}
		}else{
			if(i>j){
				System.out.println("最大值是"+i);
			}else{
				System.out.println("最大值是"+j);
			}
		}
		
		System.out.println("求1。。100的和");
		j=0;
		for(i=1;i<=100;i++){
			j=j+i;
		}
		System.out.println("1+2+3+...+100="+j);
		
		System.out.println("求1！。。10！的和");
		l=0;
		k=0;
		for(i=1;i<=10;i++){
			l=1;
			for(j=1;j<=i;j++){
				l=l*j;
			}
			System.out.println(i+"!="+l);
			k=k+l;
			if(i==1){
				System.out.println(i+"!="+k);
			}else{
				System.out.println("1!+"+"..."+i+"!="+k);
			}
		}
		System.out.println("1!+2!+...+10!="+k);
	}
}
