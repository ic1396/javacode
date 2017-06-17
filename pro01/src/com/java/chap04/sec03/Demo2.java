package com.java.chap04.sec03;

public class Demo2 {
	
	/**
	 * 向函数调用者抛出异常
	 * @param a
	 * @throws Exception
	 */
	public static void testThrow(int a) throws Exception{
		if (a == 1){
			//直接抛出一个异常类，业务性的异常都可以这样处理。
			throw new Exception("有异常");
		}
		System.out.println(a);
	}
	
	public static void main(String[] args){
		try {
			testThrow(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
