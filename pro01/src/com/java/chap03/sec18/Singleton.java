package com.java.chap03.sec18;

/**
 * 设计模式
 * 有很多设计模式：工厂、单例、代理等等。
 * 推荐书籍《Head First设计模式》
 * 这是单例设计模式示例。
 * 单例设计模式：在java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。
 * 单例设计模式有两种实现方式：一种是饿汉式，一种是懒汉式。
 * 
 */
public class Singleton {
	
	/**
	 * 构造方法私有
	 */
	private Singleton(){
		
	}
	//饿汉式
	private static final Singleton single = new Singleton();
	
	/**
	 * 获取实例
	 */
	public static Singleton getInstance(){
		return single;
	}

}
