package com.day7.work;

import java.util.Arrays;
import java.util.Scanner;

public class StringWork1 {

	public static void main(String[] args) {
		/*1.ʹ��Scanner����һ���ַ���,ͳ�����е�����  nextLine()
		1.ͳ�����ֵĸ���0-9
		2.ͳ����ĸ�ĸ���a-z A-Z
		3.ͳ�ƿհ��ַ��ĵĸ��� ' '
		4.ͳ�������ַ��ĸ���*/
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str = sc.nextLine();
		
		 char[] cs = str.toCharArray();
		 System.out.println(Arrays.toString(cs));
		 int numbers = 0;
		 int chars = 0;
		 int blanks = 0;
		 int others = 0;
		
		 for(char c:cs){
			 if('0'<=c&&c<='9'){
				 numbers++; 
			 }else if(('a'<=c&&c<='z')||('A'<=c&&c<='Z')){
				 chars++;
			 }else if(c==' '){
				 blanks++;
			 }else{
				 others++; 
			 }
		 }
		 
		 System.out.println(numbers);
		 System.out.println(chars);
		 System.out.println(blanks);
		 System.out.println(others);
	}

}
