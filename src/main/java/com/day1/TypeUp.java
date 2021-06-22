package com.day1;

public class TypeUp {
	//1
	{
	//	System.out.println(oo);//先定义后使用
		int  oo = 1;
		System.out.println(oo);
		{
			int iner = 2;
			System.out.println(oo);
			System.out.println(iner);
		}
		
	//	System.out.println(iner);//超出作用域范围
	}
	
	//2.
	{
	//	System.out.println(oo);
	}
	
	public static void main(String[] args) {
		//类型提升:当byte short char参与运算时,自动提升为int类型
		
	/*	第一，所有的byte型、short型和char的值将被提升到int型。 
		第二，如果一个操作数是long型，计算结果就是long型； 
		第三，如果一个操作数是float型，计算结果就是float型； 
		第四，如果一个操作数是double型，计算结果就是double型。 */

		/*byte b = 1;
		byte b1 =1;
		byte b2 = (byte)(b+b1);//整型+整型 = 整型
*/		
		
		byte b = -128; 
		short s = 10;
		int i = 1;
		long l = 2;
	
		char c = '我';
		
	
		//浮点数
		float f = 1.0F;
		double d = 1.0;
		
		double f1 =  (b+i)+(s+f)+(c+l)+d;
		
	}

}
