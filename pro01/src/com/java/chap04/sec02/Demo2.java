package com.java.chap04.sec02;

/**
 * finally������
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
			return;     //�ڴ˴�����return�󣬺���Ĵ����ִ�в����ˡ�ֻ��finally�еĴ����ܱ�ִ�е���
		}finally{
			System.out.println("finally end");
		}
		System.out.println("end");
	}
	public static void main(String[] args) {
		testFinally();
	}

}
