package com.java.chap03.sec13;

public class Test {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.say();
		
		Cat cat = new Cat();
		cat.say();
		
		//父类的引用指向子类的具体实现，也可以视作向上转型
		Animal animal = new Dog();
		animal.say();
		
		//向下转型，animal 被定义为 Dog 类型，所以成功转型
		Dog dog1 = (Dog)animal;
		dog1.say();
		
		//向下转型，animal 被定义为 Dog 类型，所以转型为 Cat 时出错
		//Exception in thread "main" java.lang.ClassCastException: com.java.chap03.sec13.Dog cannot be cast to com.java.chap03.sec13.Cat
		//at com.java.chap03.sec13.Test.main(Test.java:19)
		//Cat cat1 = (Cat)animal;
		//cat1.say();
		
		//随时更换为其他子类的具体实现
		animal = new Cat();
		animal.say();
		
		
	}

}
