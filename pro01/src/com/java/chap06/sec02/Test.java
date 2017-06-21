package com.java.chap06.sec02;

/**
 * Test Demo
 * 使用其他类型会报错
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
		
		//Demo<Animal> demo_C = new Demo<Animal>(new Animal());    //使用父类
		//Demo<Integer> i = new Demo<Integer>(new Integer());      //使用其他类型，发生编译错误
	}

}
