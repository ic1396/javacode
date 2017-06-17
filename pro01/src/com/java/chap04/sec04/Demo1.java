package com.java.chap04.sec04;

/**
 * Exception和RuntimeException
 * Exception：检查型异常，在程序中必须用try...catch进行处理。
 * RuntimeException：非检查型异常，可以不使用try...catch进行处理，但是如果产生异常，则将由JVM进行处理。
 * RuntimeException最好也由try...catch进行处理。
 *
 */
public class Demo1 {
	
	/**
	 * 运行时异常：编译时不检查，可以不使用try...catch进行处理
	 * @throws RuntimeException
	 */
	public static void testRuntimeException() throws RuntimeException{
		throw new RuntimeException("运行时异常");
	}
	
	/**
	 * Exception异常：编译时会检查，必须使用try...catch进行处理
	 * @throws Exception
	 */
	public static void testException() throws Exception{
		throw new Exception("Exception异常");
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
