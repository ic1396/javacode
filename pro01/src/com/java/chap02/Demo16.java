package com.java.chap02;

public class Demo16 {
	
	public static void main(String[] args) {
		
		for(int i=100;i<1000;i++){
			int b=i/100;
			int s=(i-b*100)/10;
			int g=i-b*100-s*10;
			if (i==(b*b*b+s*s*s+g*g*g)){
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		for(int m=1;m<10;m++){
			for(int n=1;n<=m;n++){
				System.out.print(m+"*"+n+"="+(m*n)+"; ");
			}
			System.out.println();
		}
	}

}
