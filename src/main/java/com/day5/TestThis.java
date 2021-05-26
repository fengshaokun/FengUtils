package com.day5;

public class TestThis {
	String name;
	int age;
	
	

	public TestThis() {
		//3.通过this(参数)的形式调用当前类中的其他构造方法
		this("aa",11); 
	}
	
	public TestThis(String name,int age) {
		//2.使用this关键字,指代当前对象的属性;此处this不可省略
		this.name = name;
		this.age = age;
	}
	
	public  void  fun1(){
		System.out.println("我是fun1");
	}
	
	
	
	public  void  fun2(){
		//1.使用调用fun2()方法的当前对象来调用当前对象的fun1;----this指代当前对象---
		this.fun1();
		System.out.println("我是fun2"+this.name);
		
	}

	
	
	
	public static void main(String[] args) {
		/*TestThis tt = new  TestThis("aa", 17);
		System.out.println(tt.);*/
		TestThis tt1 = new TestThis();
		//属性和方法都要通过对象.方法和对象.属性进行调用
		
		tt1.fun2();
		
	}

}
