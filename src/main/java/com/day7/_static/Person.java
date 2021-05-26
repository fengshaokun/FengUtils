package com.day7._static;

public class Person extends Object{
	//成员变量:所有权是对象;每个新的对象的成员的值互不影响
	public String name;
	
	//静态变量:类变量, 使用方法为类名.成员
	public static String country="中国";
	
	public void shout(){
		System.out.println("我的名字是:"+name);
		
		//非static方法可以正常的调用static变量
		System.out.println("我所在国家的名字是:"+country);
		
		//非static方法可以正常的调用static方法
		fun1();
	}
	
	//静态方法:所有权是类,static方法使用方法为类名.方法;可以不创建对象,直接类名.方法进行
	public static void fun1(){
		//static方法可以正常的调用static变量
		System.out.println("我所在国家的名字是:"+country);
		
		//static方法不能调用非static变量和方法
//		System.out.println("我的名字是:"+this.name);//不能使用this,static方法可以不创建对象
//		this.shout();
	}
	
}
