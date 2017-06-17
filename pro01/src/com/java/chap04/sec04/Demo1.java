package com.java.chap04.sec04;

/**
 * Exception��RuntimeException
 * Exception��������쳣���ڳ����б�����try...catch���д���
 * RuntimeException���Ǽ�����쳣�����Բ�ʹ��try...catch���д���������������쳣������JVM���д���
 * RuntimeException���Ҳ��try...catch���д���
 *
 */
public class Demo1 {
	
	/**
	 * ����ʱ�쳣������ʱ����飬���Բ�ʹ��try...catch���д���
	 * @throws RuntimeException
	 */
	public static void testRuntimeException() throws RuntimeException{
		throw new RuntimeException("����ʱ�쳣");
	}
	
	/**
	 * Exception�쳣������ʱ���飬����ʹ��try...catch���д���
	 * @throws Exception
	 */
	public static void testException() throws Exception{
		throw new Exception("Exception�쳣");
	}
	public static void main(String[] args) {
				
		try {
			testException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		testRuntimeException();
	}

}
