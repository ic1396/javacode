package com.java.chap02;

public class Demo18 {
	
	public static void main(String[] args) {
		//����һ�����飬���Ҿ�̬��ʼ��
		int arr[]=new int[]{1,2,3};
		
		//��ͨ�ı�������ķ�ʽ��ʹ��ѭ��
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("===============");
		//foreach��ʽ
		for(int j:arr){
			System.out.println(j);
		}
		
		//����һ�����飬Ȼ��̬��ʼ����������3
		int arr1[]=new int[3];
		//int���͵����飬Ĭ����0
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
		
	}

}
