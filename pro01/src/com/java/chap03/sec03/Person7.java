package com.java.chap03.sec03;

class SanWei{
	int b;//��Χ
	int w;//��Χ
	int h;//��Χ
}
/**
 * @author yush
 * ����ֵ���ݺ����ô��ݵ�����
 */
public class Person7 {
	
	/**
	 * @param age        //int ֵ����
	 * @param sanWei     //��SanWei ���ô��� 
	 */
	void speak(int age,SanWei sanWei){
		System.out.println("�ҽ���"+age+"�ꡣ;");
		System.out.println("�ҵ���Χ��"+sanWei.b+","+sanWei.w+","+sanWei.h);
		age=90;
		System.out.println("������"+age+"��;");
		sanWei.b=180;
	}
	public static void main(String[] args) {
		Person7 zhangsan=new Person7();
		int age=35;
		SanWei sanWei=new SanWei();
		sanWei.b=90;
		sanWei.w=69;
		sanWei.h=90;
		zhangsan.speak(age,sanWei);  //����age��sanWei��Ϊ����ִ��zhangsan.speak()
		System.out.println("----���ݲ�����--------");
		System.out.println("��������õ�ǰֵ��age="+age);
		System.out.println("��������õ�ǰֵ��sanWei.b="+sanWei.b);
	}
}
