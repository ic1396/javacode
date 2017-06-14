package com.java.chap03.sec14;

public class Test {
	
	public static void doSomeThing(Animal animal){
		
		animal.say();
		if (animal instanceof Dog){
			((Dog)animal).f1();
		}else if (animal instanceof Cat){
			((Cat)animal).f1();
		}
	}
	
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		System.out.println(dog instanceof Animal);
		System.out.println(dog instanceof Dog);
		System.out.println(dog instanceof Cat);
		
		doSomeThing(new Dog());
		doSomeThing(new Cat());
		doSomeThing(dog);
	}

}
