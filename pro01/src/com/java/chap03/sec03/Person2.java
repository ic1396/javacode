package com.java.chap03.sec03;

public class Person2 {
	
	void speak(String name){
		System.out.println("����"+name);
	}
	public static void main(String[] args) {
		Person2 person=new Person2();
		person.speak("����");
	}

}
