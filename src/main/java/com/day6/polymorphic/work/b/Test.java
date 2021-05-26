package com.day6.polymorphic.work.b;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Figure f = new Circle(5);
		//Figure f = new Rectangle(5,10);
		Figure f = new Square(10);
		System.out.println(f.getArea());
		System.out.println(f.getPer());
		
		Figure f1 = new Figure();
		f1.getArea();
		f1.getPer();
	}

}
