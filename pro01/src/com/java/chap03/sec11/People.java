package com.java.chap03.sec11;

/**
 * 抽象类
 * 定义：在java中，含有抽象方法的类称为抽象类，同样不能生成对象。
 * 包含一个抽象方法的类是抽象类
 * 抽象类和抽象方法都要用关键字 abstract 修饰；
 * 抽象方法只需要声明而不需要实现
 * 抽象类必须被子类（假如不是抽象类）必须重写抽象类中的全部抽象方法；
 * 抽象类不能被实例化；
 *
 * 定义一个抽象类
 */
public abstract class People {
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void say(){
		System.out.println("我的姓名是：" + this.getName());
	}
	
	/**
	 * 定义一个抽象方法，让子类具体实现
	 */
	public abstract void profession();

}
