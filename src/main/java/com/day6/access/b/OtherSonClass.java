package com.day6.access.b;

import com.day6.access.a.SuperClass;

public class OtherSonClass extends SuperClass{
	public void test(){
//		System.out.println(super.privateVar);//˽�е�ֻ���ڶ��������ʹ��
//		System.out.println(super.defaultVar);//������ֻ�ܶ���İ���ʹ��
//		System.out.println(super.protectedVar);
		System.out.println(super.publicVar);
	}
}