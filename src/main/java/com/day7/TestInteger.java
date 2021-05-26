package com.day7;

public class TestInteger {

	public static void main(String[] args) {
		//最大/小值的常量
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);

		
//		String str1 = "11";
//		String str2 = "22";
//		System.out.println(str1+str2);
		
		//字符串转数字
		//1.String ----> int   效率高
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
//		System.out.println(num1+num2);
		
		//2.String ----> Integer
//		Integer num1 = Integer.valueOf(str1);
//		Integer num2 = Integer.valueOf(str2);
//		System.out.println(num1 +num2);
		
		//数字转字符串
//		int x = 1;
//		//1.
//		String str = String.valueOf(x);
//		
//		//2.
//		String str = x+"";
		
		//JDK1.5及以上版本:包装类的 自动装箱和自动拆箱
		int i = 10;
		Integer ii ;
	
		//自动装箱:将基本数据类型的值---包装---> 对应的包装类类型
		ii = i;//等同于 ii = Integer.valueOf(i);
		System.out.println(ii);
		
		//自动拆箱:将包装类类型的值  ---拆箱---> 基本数据类型的值
		//i = ii;
		i = ii.intValue();
		System.out.println(i);

		
	}

}
