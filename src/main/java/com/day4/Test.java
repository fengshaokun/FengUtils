package com.day4;

public class Test {
	public static void main(String[] args) {
		/*//���Ե�ʹ��
		FieldTest p = new FieldTest();
		p.name = "����";
		
		
		FieldTest p1 = new FieldTest();
		p1.name = "ls";
		
		System.out.println(p.name);
		System.out.println(p1.name);*/
		
		//�޲ι��촴������
		TestCon tc = new TestCon();
		tc.age = 10;
		tc.name = "aa";
		System.out.println(tc);
		
		
		TestCon tc1 = new TestCon("ls",20);
		System.out.println(tc1);
	}
	

}
