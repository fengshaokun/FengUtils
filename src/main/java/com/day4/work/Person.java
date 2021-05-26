package com.day4.work;

public class Person {
	String name;
	int age;
	String sex;
	String country;
	
	public void eat(){
		System.out.println("人要吃饭");
	}
	
	public void eat(String food){
		System.out.println("人要吃饭,正在吃"+food);
	}
	
	

	public void drink(){
		System.out.println("人要喝水");
	}
	
	public void think(){
		System.out.println("人会思考");
	}
	
	
	public void shout(){
		System.out.println("我的名字是:"+name);
	}
}
