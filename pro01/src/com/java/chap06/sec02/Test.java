package com.java.chap06.sec02;

/**
 * Test Demo
 * ʹ���������ͻᱨ��
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		Demo<Dog> demo = new Demo<Dog>(new Dog());
		Dog dog = demo.getT();
		dog.print();
		
		Demo<Cat> demo_C = new Demo<Cat>(new Cat());
		Cat cat = demo_C.getT();
		cat.print();
		
		//Demo<Animal> demo_C = new Demo<Animal>(new Animal());    //ʹ�ø���
		//Demo<Integer> i = new Demo<Integer>(new Integer());      //ʹ���������ͣ������������
	}

}
