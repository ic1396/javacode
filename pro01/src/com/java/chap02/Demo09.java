package com.java.chap02;

public class Demo09 {
	public static void main(String[] args) {
		// && ��  ǰ���������������붼��true�ŷ���true�����򷵻�false
		boolean b1=(5<3)&&(5>4);  //��һ�����棺dead code
		System.out.println("b1="+b1);
		// & ����·��
		boolean b2=(5>4)&(5>4);
		System.out.println("b2="+b2);
		//һ���� && �룬Ч�ʸ�
		
		// || ��   ֻҪ ǰ��������������һ����true�ͷ���true�����򷵻�false
		boolean b3=(5>4)||(5<4);  //��һ�����棺dead code
		System.out.println("b3="+b3);
		// | ����·��
		boolean b4=(5>4)|(5<4);
		System.out.println("b4="+b4);
		// ! ��  ����в�����Ϊtrue���򷵻�false�����򷵻�true
		boolean b5=!(5>4);
		System.out.println("b5="+b5);
		// ^ ���  ����������������ͬʱ����true�����򷵻�false
		boolean b6=(5<4)^(4<6);
		System.out.println("b6="+b6);
	}

}
