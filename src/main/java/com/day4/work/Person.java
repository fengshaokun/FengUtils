package com.day4.work;

public class Person {
	String name;
	int age;
	String sex;
	String country;
	
	public void eat(){
		System.out.println("��Ҫ�Է�");
	}
	
	public void eat(String food){
		System.out.println("��Ҫ�Է�,���ڳ�"+food);
	}
	
	

	public void drink(){
		System.out.println("��Ҫ��ˮ");
	}
	
	public void think(){
		System.out.println("�˻�˼��");
	}
	
	
	public void shout(){
		System.out.println("�ҵ�������:"+name);
	}
}
