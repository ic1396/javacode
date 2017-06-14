package com.java.chap03.sec14;

public class People {
	
	private String name;
	
	public People(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
/*	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName();
	}*/

	public static void main(String[] args) {
		People p1 = new People("zhangsan");
		People p2 = new People("lisi");
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p2.toString());
		
		System.out.println(p1.equals(p2));
		
	}

}
