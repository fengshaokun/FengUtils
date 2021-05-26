package com.day4;

public class TestMethod {

	public static void main(String[] args) {
		//方法的使用
		
		//1.先建对象
		MethodTest mt = new MethodTest();
		
		
		//2.通过方法名和参数进行调用
			//2.1没有返回值的方法
			//mt.fun1();//没有返回值的方法,不能使用变量接受
			//mt.fun2("aca","bab");//有参数的方法,必须给予对应的参数(个数,类型,顺序)

			//2.2有返回值的方法
			//  mt.fun3();//有返回的方法可以按没有返回值的方法的方式进行调用
//			 int num = mt.fun3();//有返回值的方法,可以使用对应类型的变量进行接受
//			 System.out.println(num);
			 
		int num = 	mt.fun4(44, 33);
		System.out.println(num);
			 
	}

}
