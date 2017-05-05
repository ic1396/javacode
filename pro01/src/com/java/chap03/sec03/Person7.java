package com.java.chap03.sec03;

class SanWei{
	int b;//胸围
	int w;//腰围
	int h;//臀围
}
/**
 * @author yush
 * 参数值传递和引用传递的例子
 */
public class Person7 {
	
	/**
	 * @param age        //int 值传递
	 * @param sanWei     //类SanWei 引用传递 
	 */
	void speak(int age,SanWei sanWei){
		System.out.println("我今年"+age+"岁。;");
		System.out.println("我的三围是"+sanWei.b+","+sanWei.w+","+sanWei.h);
		age=90;
		System.out.println("方法里"+age+"。;");
		sanWei.b=180;
	}
	public static void main(String[] args) {
		Person7 zhangsan=new Person7();
		int age=35;
		SanWei sanWei=new SanWei();
		sanWei.b=90;
		sanWei.w=69;
		sanWei.h=90;
		zhangsan.speak(age,sanWei);  //变量age、sanWei作为参数执行zhangsan.speak()
		System.out.println("----传递参数后--------");
		System.out.println("方法外调用当前值，age="+age);
		System.out.println("方法外调用当前值，sanWei.b="+sanWei.b);
	}
}
