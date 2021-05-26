package com.day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapWork2 {
	public static void main(String[] args) {
		// 随便输入一个字符串,统计每个字符出现的次数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一句话");
		String str = sc.nextLine();
		// key:要统计的单个字符value:出现的次数
		Map<Character, Integer> counter = new HashMap<>();
		char[] chars = str.toCharArray();
		// 循环的向counter放入字符
		for (char c : chars) {
			if (counter.get(c) == null) {
				counter.put(c, 1);
			} else {
				counter.put(c, counter.get(c) + 1);
			}
		}
		System.out.println(counter);
	}
}
