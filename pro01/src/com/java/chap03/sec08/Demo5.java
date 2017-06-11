package com.java.chap03.sec08;

/**
 * String����
 * ���÷�����ʹ��
 * public char charAt(int index) �����ַ�����ָ������ֵָʾ���ַ�
 * �ַ���������ֵ��  0 ��ʼ
 * public int length() �����ַ����ĳ��ȡ�
 * ���ȵ����ַ����� Unicode ���뵥Ԫ��������
 * public int indexOf(int ch)  ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ�������
 * public int indexOf(int ch, int fromIndex)  ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ�����������ָ����������ʼ������
 * public String toUpperCase()  ���ַ����е�������ĸת��Ϊ��д������
 * public String toLowerCase()  ���ַ����е�������ĸת��ΪСд������
 *
 */
public class Demo5 {
	
	public static void main(String[] args) {
		String name = "����";
		char ming = name.charAt(1);
		System.out.println(ming);
		
		String str = "�����й���";
		for(int i = 0;i < str.length(); i ++){
			System.out.println(str.charAt(i));
		}
		
		str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("d���ַ���str�е�һ�γ��ֵ�����λ�ã�" + str.indexOf('d'));
		System.out.println("d���ַ���str�е�һ�γ��ֵ�����λ�ã�������λ��4��ʼ��" + str.indexOf('d', 4));
		
		str = "������ÿһ��";
		String str1 = "������ÿһ�죬������";
		String newstr = str.substring(1);
		System.out.println(newstr);
		String newstr1 = str1.substring(1,5);
		System.out.println(newstr1);
		
		str = "I am a boy!";
		String upStr = str.toUpperCase();  //ת��Ϊ��д
		System.out.println(upStr);
		String lowerStr = str.toLowerCase();  //ת��ΪСд
		System.out.println(lowerStr);
	}

}
