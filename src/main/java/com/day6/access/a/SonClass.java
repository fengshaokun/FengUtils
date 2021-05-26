package com.day6.access.a;

public class SonClass extends SuperClass{
	public void test(){
		//System.out.println(super.privateVar);//私有的只能在定义的类中使用
		//System.out.println(super.defaultVar);
		System.out.println(super.protectedVar);
		System.out.println(super.publicVar);
	}
}
