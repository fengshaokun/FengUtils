package com.day6.access.a;

public class SonClass extends SuperClass{
	public void test(){
		//System.out.println(super.privateVar);//˽�е�ֻ���ڶ��������ʹ��
		//System.out.println(super.defaultVar);
		System.out.println(super.protectedVar);
		System.out.println(super.publicVar);
	}
}
