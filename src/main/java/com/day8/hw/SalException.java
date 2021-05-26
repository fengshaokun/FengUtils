package com.day8.hw;
//1.继承RuntimeException
public class SalException  extends RuntimeException{


//2.一般就调用父类异常的构造方法
	public SalException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
