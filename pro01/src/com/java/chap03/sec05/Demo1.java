package com.java.chap03.sec05;

/**
 * 访问控制权限示例
 * 关键字 private、package、protected、public
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
	 * 使用 alt+shift+s 在弹出菜单中选择 “Generate Getters and Setters...”
	 * 自动快速生成get和set函数
	 * @return
	 */
	public int getA(){
		return a;
	}
	public void setA(int a){
		this.a = a;
	}

}
