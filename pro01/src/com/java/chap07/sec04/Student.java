package com.java.chap07.sec04;

public class Student {
	
	private String name;
	private Integer age;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public void say(){
		System.out.println("我的姓名是" + name);
	}
}
