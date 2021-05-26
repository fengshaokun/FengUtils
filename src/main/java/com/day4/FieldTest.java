package com.day4;
//人类的模板
//属性:姓名 年龄 性别  国籍
//行为:会吃饭,喝水,思考

//类:模板
public class FieldTest {
	//属性:描述数据,定义在类中---->成员变量:只要在类中定义,本类中都可以使用
	String name;
	
	
	//构造方法:创建对象
	
	
	//方法:描述行为
	public void shout(){
		System.out.println(name);
		String	name = "aaa";//和成员变量name同名的局部变量
		System.out.println(name);
		//局部变量:定义在方法中的变量,只能在定义的方法中使用
		int x = 1;
		System.out.println(x);
	}
	
	public void run(){
		System.out.println(name);
		
		//System.out.println(x);
	}
}
