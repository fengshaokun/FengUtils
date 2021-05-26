package com.day8;
//1.继承RuntimeException
public class AgeException  extends RuntimeException{


//2.一般就调用父类异常的构造方法
	public AgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
