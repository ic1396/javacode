package com.java.chap03.sec03;

class SanWei{
	int b;//��Χ
	int w;//��Χ
	int h;//��Χ
}
public class Person7 {
	
	void speak(int age,SanWei sanWei){
		System.out.println("�ҽ���"+age+"�ꡣ;");
		System.out.println("�ҵ���Χ��"+sanWei.b+","+sanWei.w+","+sanWei.h);
		age=90;
		System.out.println("������"+age+"��;");
		sanWei.b=80;
	}
	public static void main(String[] args) {
		Person7 zhangsan=new Person7();
		int age=35;
		SanWei sanWei=new SanWei();
		sanWei.b=90;
		sanWei.w=69;
		sanWei.h=90;
		zhangsan.speak(age,sanWei);
		System.out.println(age);
		System.out.println("���õط�����Χ"+sanWei.b);
	}
}
