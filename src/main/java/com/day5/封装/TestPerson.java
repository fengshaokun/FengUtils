package com.day5.��װ;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "a";
		p.country = "NJ";
	//	p.age = -150;//private���εĳ�Ա������ⲿ����ֱ��ʹ��
		p.setAge(-50);
		System.out.println(p);

	}

}
