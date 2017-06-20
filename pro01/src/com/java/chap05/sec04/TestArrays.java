package com.java.chap05.sec04;

import java.util.Arrays;

/**
 * Java常用类：Arrays类
 * Arrays：封装了很多操作数组的工具方法
 *
 */
public class TestArrays {
	
	public static void main(String[] args) {
		int arr[] = {1, 7, 3, 8, 2};
		System.out.println(arr);
		System.out.println("以字符串形式输出数组：" + Arrays.toString(arr));
		Arrays.sort(arr);  //给数组排序
		System.out.println("排序后的数组：" + Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 1));
		Arrays.fill(arr, 0);
		System.out.println("重置后的数组：" + Arrays.toString(arr));
	}

}
