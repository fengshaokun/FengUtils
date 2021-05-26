package com.day6.access.a;

public class SuperClass {
	//私有的只能在定义的类中使用
	private  String privateVar="私有修饰的属性";
	
	//包修饰只能定义的包中使用
	String  defaultVar="包修饰的属性";
	
	//受保护修饰可以在同包中使用,外包的子类可以使用
	protected String protectedVar="受保护修饰的属性";
	
	//公共修饰没有访问控制,只要是同一个项目就可以使用
	public  String publicVar="公共修饰的属性";
	
	
	public void test(){
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}
	
}
