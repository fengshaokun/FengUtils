package com.day4.work;

public class TestCircle {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.r = 10;
		double area= c.getArea();
		double per=c.getPer();
		
		System.out.println(area);
		System.out.println(per);
		
		Circle c1 = new Circle();
		c1.r = 20;
		double area1= c1.getArea();
		double per1=c1.getPer();
		
		System.out.println(area1);
		System.out.println(per1);
	}

}
