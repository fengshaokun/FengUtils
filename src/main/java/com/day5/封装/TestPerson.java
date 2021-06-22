package com.day5.封装;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "a";
		p.country = "NJ";
	//	p.age = -150;//private修饰的成员在类的外部不能直接使用
		p.setAge(-50);
		System.out.println(p);

	}

}
