package com.day7.work;

import java.util.Scanner;

public class StringWork2 {

	public static void main(String[] args) {
		/*1.ʹ��Scanner����һ���ַ���,ͳ�����йؼ��ʻ�ĳ��ִ���  ��"ϰ��ƽ"*/
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str = sc.nextLine();
		String s = "ϰ��ƽ";
		String str1 = str.replace(s, "");
		
		int num =( str.length()-str1.length() )/s.length();
		System.out.println("������"+num+"��");
		
		
	}

}
