package com.java.chap03.sec09;

/**
 * 子类重载父类方法
 * 重写时方法名相同
 * super的用法：可以调用父类的方法和属性（public的方法和属性）
 */
public class Cat extends Animal{
	
	String address;
	
	/**
	 * 子类无参数构造函数
	 */
	public Cat() {
		super();   //调用父类的无参数构造函数
		// TODO Auto-generated constructor stub
		System.out.println("无参数子类构造函数");
	}

	/**
	 * 子类有参数构造函数
	 * @param name
	 * @param age
	 */
	public Cat(String name, int age, String address) {
		super(name, age);   //调用父类的有参数构造函数
		this.address = address;
		// TODO Auto-generated constructor stub
		System.out.println("有参数子类构造函数");
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void say(){
		System.out.println("我是一只猫，我叫：" + this.getName() + "，我的年龄是：" + this.getAge() + "，我的地址是：" + this.getAddress());
	}
	
	public static void main(String[] args) {
		/*Cat cat = new Cat();
		cat.setName("Mini");
		cat.setAge(2);*/
		Cat cat = new Cat("nick", 1, "大连");
		cat.say();
	}

}
