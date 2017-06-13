package com.java.chap03.sec13;

public class Test {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.say();
		
		Cat cat = new Cat();
		cat.say();
		
		//���������ָ������ľ���ʵ�֣�Ҳ������������ת��
		Animal animal = new Dog();
		animal.say();
		
		//����ת�ͣ�animal ������Ϊ Dog ���ͣ����Գɹ�ת��
		Dog dog1 = (Dog)animal;
		dog1.say();
		
		//����ת�ͣ�animal ������Ϊ Dog ���ͣ�����ת��Ϊ Cat ʱ����
		//Exception in thread "main" java.lang.ClassCastException: com.java.chap03.sec13.Dog cannot be cast to com.java.chap03.sec13.Cat
		//at com.java.chap03.sec13.Test.main(Test.java:19)
		//Cat cat1 = (Cat)animal;
		//cat1.say();
		
		//��ʱ����Ϊ��������ľ���ʵ��
		animal = new Cat();
		animal.say();
		
		
	}

}
