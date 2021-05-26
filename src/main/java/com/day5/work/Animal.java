package com.day5.work;

public class Animal {
	protected	int age;
	protected	String name;
	protected	String sex;
	
	//省略get/set
	public void run(){
		System.out.println("动物会跑");
	}
	
	public void jump(){
		System.out.println("动物会跳");
	}
	
	public void eat(){
		System.out.println("动物要吃饭");
	}
	
}
