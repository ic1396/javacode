package com.java.chap03.sec09;

/**
 * �������ظ��෽��
 * ��дʱ��������ͬ
 *
 */
public class Cat extends Animal{
	
	public void say(){
		System.out.println("����һֻè���ҽУ�" + this.getName() + "���ҵ������ǣ�" + this.getAge());
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.setName("Mini");
		cat.setAge(2);
		cat.say();
	}

}
