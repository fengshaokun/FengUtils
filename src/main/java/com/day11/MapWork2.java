package com.day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapWork2 {
	public static void main(String[] args) {
		// �������һ���ַ���,ͳ��ÿ���ַ����ֵĴ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�仰");
		String str = sc.nextLine();
		// key:Ҫͳ�Ƶĵ����ַ�value:���ֵĴ���
		Map<Character, Integer> counter = new HashMap<>();
		char[] chars = str.toCharArray();
		// ѭ������counter�����ַ�
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
