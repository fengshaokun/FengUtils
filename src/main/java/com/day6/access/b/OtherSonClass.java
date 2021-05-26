package com.day6.access.b;

import com.day6.access.a.SuperClass;

public class OtherSonClass extends SuperClass{
	public void test(){
//		System.out.println(super.privateVar);//私有的只能在定义的类中使用
//		System.out.println(super.defaultVar);//包修饰只能定义的包中使用
//		System.out.println(super.protectedVar);
		System.out.println(super.publicVar);
	}
}