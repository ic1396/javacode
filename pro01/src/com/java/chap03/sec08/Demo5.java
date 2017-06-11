package com.java.chap03.sec08;

/**
 * String对象
 * 常用方法及使用
 * public char charAt(int index) 返回字符串中指定索引值指示的字符
 * 字符串的索引值从  0 开始
 * public int length() 返回字符串的长度。
 * 长度等于字符串中 Unicode 代码单元的数量。
 * public int indexOf(int ch)  返回指定字符在此字符串中第一次出现处的索引
 * public int indexOf(int ch, int fromIndex)  返回指定字符在此字符串中第一次出现处的索引，从指定的索引开始搜索。
 * public String toUpperCase()  将字符串中的所有字母转换为大写并返回
 * public String toLowerCase()  将字符串中的所有字母转换为小写并返回
 *
 */
public class Demo5 {
	
	public static void main(String[] args) {
		String name = "张三";
		char ming = name.charAt(1);
		System.out.println(ming);
		
		String str = "我是中国人";
		for(int i = 0;i < str.length(); i ++){
			System.out.println(str.charAt(i));
		}
		
		str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("d在字符串str中第一次出现的索引位置：" + str.indexOf('d'));
		System.out.println("d在字符串str中第一次出现的索引位置，从索引位置4开始：" + str.indexOf('d', 4));
		
		str = "不开心每一天";
		String str1 = "不开心每一天，不可能";
		String newstr = str.substring(1);
		System.out.println(newstr);
		String newstr1 = str1.substring(1,5);
		System.out.println(newstr1);
		
		str = "I am a boy!";
		String upStr = str.toUpperCase();  //转换为大写
		System.out.println(upStr);
		String lowerStr = str.toLowerCase();  //转换为小写
		System.out.println(lowerStr);
	}

}
