package com.day7.work;

import java.util.Arrays;
import java.util.Scanner;

public class StringWork1 {

	public static void main(String[] args) {
		/*1.使用Scanner输入一个字符串,统计其中的数据  nextLine()
		1.统计数字的个数0-9
		2.统计字母的个数a-z A-Z
		3.统计空白字符的的个数 ' '
		4.统计其他字符的个数*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
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
