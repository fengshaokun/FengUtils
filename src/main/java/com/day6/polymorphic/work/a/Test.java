package com.day6.polymorphic.work.a;

public class Test {

	public static void main(String[] args) {

		Printer p1  = 	new ColorPrinter();//���������ָ���������
		p1.print();

		Printer p2  = 	new BWPrinter();//���������ָ���������
		p2.print();
		Printer p3=new Printer();
		p3.print();
	}

}
