package com.java.chap03.sec03;

/**
 * @author yush
 * ��������ֵ����
 */
public class Person6 {
	
	/**
	 * @param name ����
	 * @param age  ����
	 * @param hobbies  ����
	 * @return  ���ذ��õĸ���
	 */
	int speak(String name,int age,String ...hobbies){
		System.out.println("����"+name+", �ҽ���"+age+"�ꡣ");
		for(String hobby:hobbies){
			System.out.print(hobby+" ");
		}
		int totalHobbies=hobbies.length;
		return totalHobbies;
	}
	public static void main(String[] args) {
		Person6 zhangsan=new Person6();
		int n=zhangsan.speak("����",30,"sing","swim","dance");
		System.out.println("��"+n+"������");
	}
}
