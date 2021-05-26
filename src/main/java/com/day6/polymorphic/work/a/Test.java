package com.day6.polymorphic.work.a;

public class Test {

	public static void main(String[] args) {

		Printer p1  = 	new ColorPrinter();//父类的引用指向子类对象
		p1.print();

		Printer p2  = 	new BWPrinter();//父类的引用指向子类对象
		p2.print();
		Printer p3=new Printer();
		p3.print();
	}

}
