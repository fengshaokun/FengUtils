package com.day1;

public class TypeChange {

	public static void main(String[] args) {
	//类型转换:目标类型与源类型 兼容   boolean不参与转换
		//1.自动类型转换
		//自动类型转换(向上造型):取值范围小的变量类型 可以自动转为 取值范围大的变量类型--->安全(小转大,自动转)  jvm
		byte b = 1;
		int i = b;
		
		
		//2.强制类型转换(向下造型):取值范围大的变量类型 不可以自动转为 取值范围小的变量类型--->不安全(大转小,强制转)   程序员强制jvm
		
		//b = i;//不可以自动
		i = 1000;
		
		b = (byte)i;
	//	System.out.println(b);
		
		int i1 = 'c';
	//	System.out.println(i1);
		
		//boolean不参与转换
		/*boolean bo = true;
		i1 = (int)bo;*/
		
		double  dd = 1.999999999;
		int ii = (int)dd;
		System.out.println(ii);
	}

}
