package com.day5.继承;

public  class Person {
	protected String name;
	int age;
	String sex;
    private	String country;
	
	//省略get/set
	
	public void run(){
		System.out.println("人会跑");
	}
	
	
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", country=" + country + "]";
	}
	
	
}
