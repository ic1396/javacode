package com.java.chap02;

public class Demo18 {
	
	public static void main(String[] args) {
		//定义一个数组，并且静态初始化
		int arr[]=new int[]{1,2,3};
		
		//普通的遍历数组的方式，使用循环
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("===============");
		//foreach方式
		for(int j:arr){
			System.out.println(j);
		}
		
		//定义一个数组，然后动态初始化，长度是3
		int arr1[]=new int[3];
		//int类型的数组，默认是0
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		
	}

}
