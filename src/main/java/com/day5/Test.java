package com.day5;
class Father{
	String color = "红色";
	
	public Father() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void fun(){
		System.out.println("颜色为:"+color);
	}
}

class Son extends Father {
	
	String color = "黄色";
	
		
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s = new Son();
		s.fun();
	}

}
