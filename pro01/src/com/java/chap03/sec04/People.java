package com.java.chap03.sec04;

/**
 * ����
 * @author
 *
 */
public class People {
	
	private String name;     //ʵ��������ʱ��Ĭ��ֵ��null
	private int age;         //ʵ��������ʱ��Ĭ��ֵ��0
	
	/**
	 * Ĭ�Ϲ��캯�����޲���
	 * ���캯��û�з���ֵ�����캯������������ͬ�������أ�һ����ɾ��ж�����캯��
	 * δ�����κι��캯��ʱ���������Զ�����һ��Ĭ�ϵ��޲����Ĺ��캯��
	 * �����幹�캯��ʱ�������������Զ�����һ��Ĭ�ϵ��޲����Ĺ��캯��
	 * �ڳ�����û����ȷ���壬ֱ�ӵ���Ĭ�ϵ��޲����Ĺ��캯���ᱨ��
	 */
	People(){
		System.out.println("Ĭ�Ϲ��캯��");
	}
	
	/**
	 * �������Ĺ��캯��
	 * @param myName
	 * @param myAge
	 */
	People(String myName, int myAge){
		this();    //�����޲����Ĺ��췽����������ڹ��캯���ĵ�һ��
		System.out.println("���������캯��");
		name = myName;
		age = myAge;
	}
	
	/**
	 * ������  ��  this �ؼ���
	 * this ��ʾ  ��ǰ����
	 * ��ʹ��this���ñ����е����ԡ����췽��
	 * @param name
	 * @param age
	 */
/*	People(String name, int age){
		System.out.println("���������캯��");
		this.name = name;
		this.age = age;
	}*/
	public void say(){
		System.out.println("����" + name + "���ҽ���" + age + "�ꡣ");
	}
	
	public static void main(String[] args) {
		/*People zhangsan = new People();
		zhangsan.say();*/
		People lisi = new People("����", 20);
		lisi.say();
	}

}
