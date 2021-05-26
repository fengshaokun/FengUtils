package com.day7.work;

import java.util.Scanner;

public class StringWork2 {

	public static void main(String[] args) {
		/*1.使用Scanner输入一个字符串,统计其中关键词汇的出现次数  如"习近平"*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc.nextLine();
		String s = "习近平";
		String str1 = str.replace(s, "");
		
		int num =( str.length()-str1.length() )/s.length();
		System.out.println("共出现"+num+"次");
		
		
	}

}
