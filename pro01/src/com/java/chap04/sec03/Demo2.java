package com.java.chap04.sec03;

public class Demo2 {
	
	/**
	 * �����������׳��쳣
	 * @param a
	 * @throws Exception
	 */
	public static void testThrow(int a) throws Exception{
		if (a == 1){
			//ֱ���׳�һ���쳣�࣬ҵ���Ե��쳣��������������
			throw new Exception("���쳣");
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
