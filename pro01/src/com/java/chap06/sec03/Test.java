package com.java.chap06.sec03;

import com.java.chap06.sec02.Animal;
import com.java.chap06.sec02.Cat;
import com.java.chap06.sec02.Demo;
import com.java.chap06.sec02.Dog;

/**
 * 通配符泛型
 * 在使用泛型特殊的场景下用到，例如：把泛型对象作为方法参数传入到方法的时候。
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
