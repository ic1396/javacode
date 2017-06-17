package com.java.chap04.sec02;

/**
 * 捕获和处理异常
 * 关键字  try...catch...finally
 * 注意：e.printStackTrace()与System.out.println("继续执行")是并行执行
 * 的，多次执行会发现两次打印输出顺序并不确定。
 * catch 可以有多个，发生哪个异常就执行哪个。有多个catch时，按照范围有小到大，catch由上至下排列，否则
 * 编译时产生“代码不可达”错误。
 * 
 */
public class Demo1 {
	
	public static void main(String[] args) {
		String str = "123a";
		try{
			int a = Integer.parseInt(str);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("继续执行");
	}

}
