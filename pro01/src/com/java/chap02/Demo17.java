package com.java.chap02;

import java.util.Scanner;

public class Demo17 {
	
	public static void main(String[] args) {
		/*outer:
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==1){
					//break;//������ǰѭ��
					break outer;//��ת��outer
				}
				System.out.print("i="+i+" "+"j="+j+"; ");
			}
			System.out.println();
		}*/	
		/*for(int i=0;i<10;i++){
			if(i==3||i==6){
				continue;//������ǰѭ���ı��β���
			}
			System.out.print("i="+i+" ");
		}*/
		/*for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==1){
					return;//��������ִ��
				}
				System.out.print("i="+i+" "+"j="+j+"; ");
			}
			System.out.println();
		}*/
		//System.out.println("ִ�е�����");
		int i=0;
		int j=0;
		int k=0;
		int l=0;
		
		System.out.println("������������");
		i=3;
		j=5;
		System.out.println("����ǰ��������");
		System.out.println("i="+i+", j="+j);
		
		k=i;
		i=j;
		j=k;
		System.out.println("��������������");
		System.out.println("i="+i+", j="+j);
		
		System.out.println("�����������е����ֵ");
		
		System.out.println("�����һ�����֣�");
		Scanner scanner=new Scanner(System.in);
		k=scanner.nextInt();
		System.out.println("����ڶ������֣�");
		i=scanner.nextInt();
		System.out.println("������������֣�");
		j=scanner.nextInt();
		scanner.close();
		if(k>i){
			if(k>j){
				System.out.println("���ֵ��"+k);
			}else{
				System.out.println("���ֵ��"+j);
			}
		}else{
			if(i>j){
				System.out.println("���ֵ��"+i);
			}else{
				System.out.println("���ֵ��"+j);
			}
		}
		
		System.out.println("��1����100�ĺ�");
		j=0;
		for(i=1;i<=100;i++){
			j=j+i;
		}
		System.out.println("1+2+3+...+100="+j);
		
		System.out.println("��1������10���ĺ�");
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
