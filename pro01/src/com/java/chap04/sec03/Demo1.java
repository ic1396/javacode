package com.java.chap04.sec03;

/**
 * throws 和 throw 关键字
 * throws：当前方法不处理异常，而是交给方法的调用处去处理。
 * throw：直接抛出一个异常。
 *
 */
public class Demo1 {
	
	/**
	 * 把异常向外面抛
	 * @throws NumberFormatException
	 */
	public static void testThrows() throws NumberFormatException{
		String str = "123a";
		int a = Integer.parseInt(str);
		System.out.println(a);
	}
	public static void main(String[] args) {
		try{
			testThrows();
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("在这里处理异常");
		}
		System.out.println("这里是调用处的下一句");		
	}

}
