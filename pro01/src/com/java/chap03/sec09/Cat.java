package com.java.chap03.sec09;

/**
 * �������ظ��෽��
 * ��дʱ��������ͬ
 * super���÷������Ե��ø���ķ��������ԣ�public�ķ��������ԣ�
 */
public class Cat extends Animal{
	
	String address;
	
	/**
	 * �����޲������캯��
	 */
	public Cat() {
		super();   //���ø�����޲������캯��
		// TODO Auto-generated constructor stub
		System.out.println("�޲������๹�캯��");
	}

	/**
	 * �����в������캯��
	 * @param name
	 * @param age
	 */
	public Cat(String name, int age, String address) {
		super(name, age);   //���ø�����в������캯��
		this.address = address;
		// TODO Auto-generated constructor stub
		System.out.println("�в������๹�캯��");
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void say(){
		System.out.println("����һֻè���ҽУ�" + this.getName() + "���ҵ������ǣ�" + this.getAge() + "���ҵĵ�ַ�ǣ�" + this.getAddress());
	}
	
	public static void main(String[] args) {
		/*Cat cat = new Cat();
		cat.setName("Mini");
		cat.setAge(2);*/
		Cat cat = new Cat("nick", 1, "����");
		cat.say();
	}

}
