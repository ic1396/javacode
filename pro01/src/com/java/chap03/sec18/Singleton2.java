package com.java.chap03.sec18;

/**
 * 
 */
public class Singleton2 {
	
	/**
	 * 构造方法私有
	 */
	private Singleton2(){
		
	}
	//懒汉式
	private static Singleton2 single = null;

	/**
	 * 获取实例
	 */
	public static Singleton2 getInstance(){
		if (single == null){
			System.out.println("第一次调用");
			single = new Singleton2();
		}
		return single;
	}
	
/*	public synchronized static Singleton2 getInstance(){  //多线程时需要加锁，避免多个线程的冲突
		if (single == null){
			System.out.println("第一次调用");
			single = new Singleton2();
		}
		return single;
	}*/

}
