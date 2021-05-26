package com.day6.hw;

public abstract class Person {
	public abstract void eat();
	public abstract void drink();
	
	public static void main(String[] args) {
		/*Person p = new Souther();
		p.eat();
		p.drink();*/
		
		Person p = new Norther();
		p.eat();
		p.drink();
	}
}


