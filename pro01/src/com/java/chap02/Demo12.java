package com.java.chap02;

public class Demo12 {
	public static void main(String[] args) {
		int a=-1;
		// if ���
		//����ע��  ��ѡ���У��� ctrl+shift+/
		if (a>0) {
			System.out.println(a+"������");
		}
		// if...else ���
		if (a>0) {
			System.out.println(a+"������");
		}else{
			System.out.println(a+"��������");
		}
		// if...else if...else
		if (a>0) {
			System.out.println(a+"������");
		}else if (a<0) {
			System.out.println(a+"�Ǹ���");
		}else{
			System.out.println(a+"��0");
		}
	}

}
