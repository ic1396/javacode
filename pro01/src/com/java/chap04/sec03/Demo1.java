package com.java.chap04.sec03;

/**
 * throws �� throw �ؼ���
 * throws����ǰ�����������쳣�����ǽ��������ĵ��ô�ȥ����
 * throw��ֱ���׳�һ���쳣��
 *
 */
public class Demo1 {
	
	/**
	 * ���쳣��������
	 * @throws NumberFormatException
	 */
	public static void testThrows() throws NumberFormatException{
		String str = "123a";
		int a = Integer.parseInt(str);
		System.out.println(a);
	}
	public static void main(String[] args) {
		try{
			testThrows();
		}catch(Exception e){
			//e.printStackTrace();
			System.out.println("�����ﴦ���쳣");
		}
		System.out.println("�����ǵ��ô�����һ��");		
	}

}
