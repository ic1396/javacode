package com.java.chap03.sec08;

/**
 * String����
 * == �� equals����������
 * == �Ƚϵ�������
 * equals �Ƚϵ��Ǿ�������
 */
public class Demo2 {
	
	public static void main(String[] args) {
		String name1 = "����";  //ֱ�Ӹ�ֵ��ʽ�����Ѵ��ڣ��½����󣬵�������Ϊ������������Դ
		String name2 = new String("����");  //new��ʽ��ÿ�δ���һ���¶�������Ϊ������������Դ
		String name3 = name2;   //�������ã�ָ��ͬһ������
		
		//== �Ƚϵ�������
		System.out.println("name1==name2: " + (name1 == name2));
		System.out.println("name1==name3: " + (name1 == name3));
		System.out.println("name3==name2: " + (name3 == name2));
		
		//equals �Ƚϵ��Ǿ�������
		System.out.println("name1.equals(name2): " + (name1.equals(name2)));
		System.out.println("name1.equals(name3): " + (name1.equals(name3)));
		System.out.println("name3.equals(name2): " + (name3.equals(name2)));
	}

}
