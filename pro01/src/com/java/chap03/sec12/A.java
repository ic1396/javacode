package com.java.chap03.sec12;

/**
 * 接口
 * 定义：一种特殊的抽象类，没有普通方法，由全局常量和公共的抽象方法所组成。
 * 接口定义用关键字 interface 。
 * 定义的接口不能被直接实例化，必须存在一个实现类，实现定义的接口
 * 接口的实现类使用关键字 implements
 * 实现接口时可实现多个接口，用逗号分隔
 * 可以同时继承类并实现接口，必须先继承，后实现接口
 * 接口的继承：接口可以多继承（类只能单继承）
 *
 */
public interface A {
	
	/**
	 * 全局常量
	 */
	public static final String TITLE = "www.java.com";
	
	/**
	 * 抽象方法，此时 abstract 可以省略
	 */
	public abstract void a();

}
