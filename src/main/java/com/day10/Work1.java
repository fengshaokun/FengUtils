package com.day10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Work1 {

	public static void main(String[] args) {
//ʹ��Scanner����һ�仰nextLine()ͳ�Ƴ����˶��ٸ��ַ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�仰");
		String str = sc.nextLine();
		//�Զ��޳��ظ����ַ�
		Set<Character>set = new HashSet<>();
		for(int i = 0;i<str.length();i++){
			set.add(str.charAt(i));
		}
		
		System.out.println(set.size());
		System.out.println(set);
		//�������˶��ٸ��ַ�
		
		//char[] cs = i.toCharArray();
		//System.out.println("һ��������"+cs.length+"���ַ�");
	//	List<String>list = new ArrayList<>();               
	}

}
