package com.day6.factory;

public class ServiceB {
	//Ason2 a = new Ason2();
	A a = Factory.createB();
	public void testB(){
		System.out.println("ServiceBµÄµ÷ÓÃ");
		a.afun();
	}
	
	
}
