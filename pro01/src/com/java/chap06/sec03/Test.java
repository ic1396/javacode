package com.java.chap06.sec03;

import com.java.chap06.sec02.Animal;
import com.java.chap06.sec02.Cat;
import com.java.chap06.sec02.Demo;
import com.java.chap06.sec02.Dog;

/**
 * ͨ�������
 * ��ʹ�÷�������ĳ������õ������磺�ѷ��Ͷ�����Ϊ�����������뵽������ʱ��
 *
 */
public class Test {
	
	private static void take(Demo<?> a){
		a.print();
	}
	
	public static void main(String[] args) {
		
		Demo<Dog> dog = new Demo<Dog>(new Dog());
		take(dog);
		Demo<Cat> cat = new Demo<Cat>(new Cat());
		take(cat);
		Demo<Animal> animal = new Demo<Animal>(new Animal());
		take(animal);
	}

}
