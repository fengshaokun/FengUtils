package com.day6.abs;

public class Test {

	public static void main(String[] args) {
		// 抽象类不能创建对象
		//Figure f = new Figure();
		
		Figure f = new  Circle(10);
		System.out.println(f.getArea());
	}

}
