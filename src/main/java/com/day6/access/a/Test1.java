package com.day6.access.a;
//同包非子类
public class Test1 {
	public static void main(String[] args) {
		SuperClass sc = new SuperClass();
	//	System.out.println(sc.privateVar);
		System.out.println(sc.defaultVar);
		System.out.println(sc.protectedVar);
		System.out.println(sc.publicVar);
		
		AAA a = new AAA();
	}
}
