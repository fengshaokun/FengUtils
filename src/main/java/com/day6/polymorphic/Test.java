package com.day6.polymorphic;

public class Test {
	public static void fun(int  x){//不光可以接受int类型,还可以接受范围小于int的类型
		System.out.println(x);
	}
	
	public static void fun1(Animal a){//不光可以接受Animal类型,还能接受Animal的子类类型
		a.eat();
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		//基本数据类型的转换
		byte b = 1;
	//	fun('a');
		int i = 1;//自动类型转换  jvm
		
	//	b = (byte)i;//强转   程序员
		
		
		
		//引用数据类型的转换
		//类型转换的前提:2个类型兼容-->父类与子类
		//引用数据类型的自动类型转换:子类可以自动转换为父类
		Herbivore hb = new Herbivore();
		hb.eat();
		Predator pd = new Predator();
	
		Animal a  =  pd;//将Herbivore类型 hb的值当成Animal使用;而不是变成Animal类型
		a.eat();
		
		
		
		
		//引用数据类型的强制类型转换:父类不能自动转换为子类;可以由调用者强制转换为子类
		/*hb = (Herbivore)a;
		hb.eat();*/
		
		/*Animal a  = new  Animal();
		Herbivore	hb = (Herbivore)a;*/

	}

}
