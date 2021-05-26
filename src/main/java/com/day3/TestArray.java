package com.day3;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		//1.声明数组--->规定数组变量的名字和其中元素类型
		int[] ia ;
		//int ia1[];
		
		//2.初始化数组--->给数组变量进行赋值
		  //1.动态初始化--->创建数组对象与对数组中元素的初始化赋值分开进行;
		    //java会自动根据元素类型赋予元素初始值
			ia = new int[5];
			System.out.println(Arrays.toString(ia));
			//创建一个新的数组对象,并规定数组的长度;
//			/**数组的下标从0开始,到ia.length-1结束*/
//			ia[0] = 1;//给数组中的第一个元素赋值为1
//			ia[1] = 2;
//			ia[ia.length-1] = 5;
//			System.out.println(ia.length);
//			System.out.println(Arrays.toString(ia));
		  
		  //2.静态初始化--->创建数组对象与对数组中元素的赋值同时进行
			/*ia = new int[]{1,2,3,4};//由赋值的个数 隐藏的规定数组的长度
			System.out.println(ia.length);
			System.out.println(Arrays.toString(ia));*/
		
			//同时完成数组的声明,数组的初始化,数组元素的初始化赋值
		/*	int[] ia1 = {1,2,3,4};
			System.out.println(ia1.length);
			System.out.println(Arrays.toString(ia1));
			
			ia1[2]  = 1000;
			System.out.println(Arrays.toString(ia1));*/
	}

}
