package com.day7._static;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person.fun1();
		
		Person p1 = new Person();
		Person.country = "�л����񹲺͹�";
		p1.name = "aa";
		p1.shout();
		System.out.println(Person.country);
		
		Person p2 = new Person();
		p2.name = "bb";
		p2.shout();
		System.out.println(Person.country);
		
		System.out.println("----------------------------");
		
		Person.country = "�л��۹�";
		System.out.println(Person.country);
		System.out.println(Person.country);
		
		
		
	
		
	}
	
	
	

}
