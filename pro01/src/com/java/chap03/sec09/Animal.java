package com.java.chap03.sec09;

/**
 * Javaֻ֧�ֵ��̳�
 * ˽�з������ܼ̳�
 * ������
 *
 */
public class Animal {
	
	private String name;  //����
	private int age;  //����
	
	/**
	 * �޲������๹�캯��
	 */
	public Animal(){
		System.out.println("�޲������๹�캯��");
	}
	
	/**
	 * @param name  //����
	 * @param age   //����
	 */
	public Animal(String name, int age) {
		System.out.println("�в������๹�캯��");
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void say(){
		System.out.println("����һ������ҽУ�" + this.name + "���ҵ������ǣ�" + this.age);
		//System.out.println("����һ������ҽУ�" + this.getName() + "���ҵ������ǣ�" + this.getAge());
	}
	

}
