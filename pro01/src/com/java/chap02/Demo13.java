package com.java.chap02;

//import java.util.*  //2�����������ģ��
import java.util.Scanner;

public class Demo13 {
	
	public static void main(String[] args) {
		System.out.println("������һ�����֣�");
		//����һ��ϵͳ�������
		//�Զ����� ctrl+shift+o
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.close();
		switch(n){
			case 1:{
				System.out.println("����1");
				break;
			}
			case 2:{
				System.out.println("����2");
				break;
			}
			default:{
				System.out.println("������������");
			}
		}
	}

}
