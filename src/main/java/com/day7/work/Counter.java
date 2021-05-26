package com.day7.work;

public class Counter {
	private static int  num=0;

	public Counter() {
		num++;
	}

	public static int getNum() {
		return num;
	}

}
