package com.java.chap05.sec04;

import java.util.Arrays;

/**
 * Java�����ࣺArrays��
 * Arrays����װ�˺ܶ��������Ĺ��߷���
 *
 */
public class TestArrays {
	
	public static void main(String[] args) {
		int arr[] = {1, 7, 3, 8, 2};
		System.out.println(arr);
		System.out.println("���ַ�����ʽ������飺" + Arrays.toString(arr));
		Arrays.sort(arr);  //����������
		System.out.println("���������飺" + Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 1));
		Arrays.fill(arr, 0);
		System.out.println("���ú�����飺" + Arrays.toString(arr));
	}

}
