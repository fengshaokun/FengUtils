package com.day10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Work1 {

	public static void main(String[] args) {
//使用Scanner输入一句话nextLine()统计出现了多少个字符
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一句话");
		String str = sc.nextLine();
		//自动剔除重复的字符
		Set<Character>set = new HashSet<>();
		for(int i = 0;i<str.length();i++){
			set.add(str.charAt(i));
		}
		
		System.out.println(set.size());
		System.out.println(set);
		//公出现了多少个字符
		
		//char[] cs = i.toCharArray();
		//System.out.println("一共出现了"+cs.length+"个字符");
	//	List<String>list = new ArrayList<>();               
	}

}
