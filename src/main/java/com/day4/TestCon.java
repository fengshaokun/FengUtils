package com.day4;

public class TestCon {
	String name;
	int age;
	
	//构造方法:用于创建对象
	//1.没有返回值类型,不同于返回值为void
	//2.方法名与类名相同
	
	public TestCon(){
		
	}
	
	
	//有参构造
	public TestCon(String aa,int bb){
		name = aa;
		age = bb;
		for(int i=0;i<10;i++){
		System.out.println("a--->"+i);
		}
	}
	
	public  void fun(){
		System.out.println("我是方法");
	}


	@Override
	public String toString() {
		return "TestCon [name=" + name + ", age=" + age + "]";
	}
	
	
}
