package com.java.chap03.sec11;

/**
 * ������
 * ���壺��java�У����г��󷽷������Ϊ�����࣬ͬ���������ɶ���
 * ����һ�����󷽷������ǳ�����
 * ������ͳ��󷽷���Ҫ�ùؼ��� abstract ���Σ�
 * ���󷽷�ֻ��Ҫ����������Ҫʵ��
 * ��������뱻���ࣨ���粻�ǳ����ࣩ������д�������е�ȫ�����󷽷���
 * �����಻�ܱ�ʵ������
 *
 * ����һ��������
 */
public abstract class People {
	
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void say(){
		System.out.println("�ҵ������ǣ�" + this.getName());
	}
	
	/**
	 * ����һ�����󷽷������������ʵ��
	 */
	public abstract void profession();

}
