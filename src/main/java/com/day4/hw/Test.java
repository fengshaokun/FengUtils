package com.day4.hw;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey m1 = new Monkey();
		m1.name = "Ã«Ã«";
		m1.run();
		m1.jump();
		m1.climb();
		m1.eat(1);
		m1.eat(4);
		m1.turn(10);
		System.out.println("\n----------------------------------------------\n");
		
		Monkey m2 = new Monkey("ÌøÌø","½ğË¿ºï","¹«",3,"»Æ");
		m2.run();
		m2.jump();
		m2.climb();
		m2.eat(6);
		m2.eat(2);
		m2.turn(5);
		
		
		
	}

}
