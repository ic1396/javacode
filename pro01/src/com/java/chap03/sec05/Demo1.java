package com.java.chap03.sec05;

/**
 * ���ʿ���Ȩ��ʾ��
 * �ؼ��� private��package��protected��public
 *
 */
public class Demo1 {
	
	private int a;
	public int b;
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	/**
	 * ʹ�� alt+shift+s �ڵ����˵���ѡ�� ��Generate Getters and Setters...��
	 * �Զ���������get��set����
	 * @return
	 */
	public int getA(){
		return a;
	}
	public void setA(int a){
		this.a = a;
	}

}
