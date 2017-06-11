package com.java.chap03.sec08;

/**
 * String对象
 * == 和 equals方法的区别
 * == 比较的是引用
 * equals 比较的是具体内容
 */
public class Demo2 {
	
	public static void main(String[] args) {
		String name1 = "李四";  //直接赋值方式，若已存在，新建对象，但不重新为对象分配堆区资源
		String name2 = new String("李四");  //new方式，每次创建一个新对象，重新为对象分配堆区资源
		String name3 = name2;   //传递引用，指向同一个堆区
		
		//== 比较的是引用
		System.out.println("name1==name2: " + (name1 == name2));
		System.out.println("name1==name3: " + (name1 == name3));
		System.out.println("name3==name2: " + (name3 == name2));
		
		//equals 比较的是具体内容
		System.out.println("name1.equals(name2): " + (name1.equals(name2)));
		System.out.println("name1.equals(name3): " + (name1.equals(name3)));
		System.out.println("name3.equals(name2): " + (name3.equals(name2)));
	}

}
