package com.java.chap02;

public class Demo19 {
	
	public static void main(String[] args) {
		/*int arr[][]=new int[][]{{1,2,3},{4,5,6,-1},{7,8,9}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println("--------------");
		}*/
		/*int [][]arr=new int [3][5];
		arr[1][4]=-1;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println("--------------");
		}*/
		//ÆðÅÝ·¨ÅÅÐò
		int k;
		int arr[]=new int []{4,21,0,-12,-3};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					k=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;					
				}
			}
			for (int a:arr){
				System.out.print(a+"   ");
			}
			System.out.println();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("max="+max+", min="+min);
		System.out.println("==============");
	}
}
