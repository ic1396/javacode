package com.java.chap03.sec02;

/**
 * Person��    �ļ�������������һ��
 * @author yushVM
 *
 */
public class Person {
	
	String name; //������,����һ������name�ַ�������,���Դ���ַ���"����"
	int age;   //������,����һ������age��������
	
	public void speak(){
		System.out.println("�ҽ�"+name+", �ҽ���"+age+"�ꡣ");
	}
	public static void main(String[] args) {
		//����һ��Person��Ķ���
		Person zhangsan;
		//ʵ����һ������
		zhangsan=new Person();
		zhangsan.name="����";  //Ϊ���Ը�ֵ
		zhangsan.age=89;
		zhangsan.speak();
	}
}
