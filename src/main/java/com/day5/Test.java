package com.day5;
class Father{
	String color = "��ɫ";
	
	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void fun(){
		System.out.println("��ɫΪ:"+color);
	}
}

class Son extends Father {
	
	String color = "��ɫ";
	
		
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.fun();
	}

}
