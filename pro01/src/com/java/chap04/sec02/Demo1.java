package com.java.chap04.sec02;

/**
 * ����ʹ����쳣
 * �ؼ���  try...catch...finally
 * ע�⣺e.printStackTrace()��System.out.println("����ִ��")�ǲ���ִ��
 * �ģ����ִ�лᷢ�����δ�ӡ���˳�򲢲�ȷ����
 * catch �����ж���������ĸ��쳣��ִ���ĸ����ж��catchʱ�����շ�Χ��С����catch�����������У�����
 * ����ʱ���������벻�ɴ����
 * 
 */
public class Demo1 {
	
	public static void main(String[] args) {
		String str = "123a";
		try{
			int a = Integer.parseInt(str);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("����ִ��");
	}

}
