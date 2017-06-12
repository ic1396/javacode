package com.java.chap03.sec11;

public class Test {
	
	public static void main(String[] args) {
		
		//People people = new People();  //报错：不能实例化抽象类
		Student student = new Student();
		student.profession();
		
		Teacher teacher = new Teacher();
		teacher.profession();
	}

}
