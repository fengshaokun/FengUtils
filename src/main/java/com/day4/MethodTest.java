package com.day4;

public class MethodTest {
	//1.返回值为void,没有参数的方法-->fun1
	public void fun1(){
		System.out.println("这是一个返回值为void,没有参数的方法");
	}
	
	//2.返回值为void,带参数的方法
	public void fun2(String arg1,String arg2){
	//	fun1();//本类中直接调用
		System.out.println("这是一个返回值为void,有2个参数的方法");
		System.out.println("参数1:"+arg1);
		System.out.println("参数2:"+arg2);
	}
	
	//3.有返回值,不带参数的方法--->返回值的类型由return后的值决定
	//return:终止方法的运行;并返回一个值
	public int	fun3(){
		int num1 = 100;
		int num2 = 50;
		System.out.println("aaaaa");
		return num1/num2;//2
	}
	
	//4.有返回值,带参数的方法
	public int	fun4(int num1,int num2){
		int sum = num1+num2;
		return sum;
	}

}
