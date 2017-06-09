package com.java.chap03.sec03;

public class Demo03 {
	
	/**
	 * 非递归方式求n的阶乘
	 * @param n
	 * @return
	 */
	static long FactorialbyLoop(int n){
		long result = 1;
		for (int i = 1; i <= n; i ++){
			result *= i; 
		}
		return result;
	}
	
	/**
	 * 递归方式求n的阶乘
	 * @param n
	 * @return
	 */
	static long FactorialbyRecursion(int n){
		long result = 1;
		if (n == 1){
			return 1;
		}
		result = n * FactorialbyRecursion(n - 1);
		return result;
	}
	
	/**
	 * 采用循环的方式求Fibonacci Sequence第n各数是多少
	 * @param n
	 * @return
	 */
	static long FibonacciSequencebyLoop(int n){
		long result = 1;
		long last1 = 1;
		long last2 = 1;
		if (n == 1) result = 1;
		if (n == 2) result = 1;
		if (n >= 3){
			for (int i = 3; i <= n; i ++){
				result = last1 + last2;
				last2 = last1;
				last1 = result;
			}
		}
		return result;
	}
	
	/**
	 * 采用递归的方式求Fibonacci Sequence第n各数是多少
	 * @param n
	 * @return
	 */
	static long FibonacciSequencebyRecursion(int n){
		long result = 1;
		if (n == 1) result = 1;
		if (n == 2) result = 1;
		if (n >= 3){
			result = FibonacciSequencebyRecursion(n - 1) + FibonacciSequencebyRecursion(n - 2);
		}
		return result;
	}
	
	public static void main(String[] args) {
//		System.out.println(Demo03.FactorialbyLoop(6));  //1*2*3*4*5*6
//		System.out.println(Demo03.FactorialbyRecursion(7));  //1*2*3*4*5*6*7
		System.out.println(Demo03.FibonacciSequencebyLoop(1));
		System.out.println(Demo03.FibonacciSequencebyLoop(2));
		System.out.println(Demo03.FibonacciSequencebyLoop(3));
		System.out.println(Demo03.FibonacciSequencebyLoop(4));
		System.out.println(Demo03.FibonacciSequencebyLoop(5));
		System.out.println(Demo03.FibonacciSequencebyLoop(6));
		System.out.println(Demo03.FibonacciSequencebyLoop(7));
		System.out.println("--------------------------------------");
		System.out.println(Demo03.FibonacciSequencebyRecursion(10));
		System.out.println(Demo03.FibonacciSequencebyRecursion(9));
		System.out.println(Demo03.FibonacciSequencebyRecursion(8));
		System.out.println(Demo03.FibonacciSequencebyRecursion(7));
		System.out.println(Demo03.FibonacciSequencebyRecursion(6));
		System.out.println(Demo03.FibonacciSequencebyRecursion(5));
		System.out.println(Demo03.FibonacciSequencebyRecursion(4));
		System.out.println(Demo03.FibonacciSequencebyRecursion(3));
		System.out.println(Demo03.FibonacciSequencebyRecursion(2));
		System.out.println(Demo03.FibonacciSequencebyRecursion(1));
	}

}
