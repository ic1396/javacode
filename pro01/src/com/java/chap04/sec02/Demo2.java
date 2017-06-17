package com.java.chap04.sec02;

/**
 * finally的作用
 *
 */
public class Demo2 {
	
	public static void testFinally(){
		String str = "123a";
		try{
			int a = Integer.parseInt(str);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Exceptions");
			return;     //在此处增加return后，后面的代码就执行不到了。只有finally中的代码能被执行到。
		}finally{
			System.out.println("finally end");
		}
		System.out.println("end");
	}
	public static void main(String[] args) {
		testFinally();
	}

}
