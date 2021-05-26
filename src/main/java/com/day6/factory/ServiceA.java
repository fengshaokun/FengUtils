package com.day6.factory;

public class ServiceA {
	//Ason2 a = new Ason2();
	A a = Factory.createA();
	public void testA(){
		System.out.println("ServiceAµÄµ÷ÓÃ");
		a.afun();
	}
	
	
}
