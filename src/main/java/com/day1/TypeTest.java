package com.day1;

public class TypeTest {

	public static void main(String[] args) {
		//数字型
			//整数
			byte b = -128; //字节型 -2^7 ---- 2^-1  -128--127
			short s = 10;//短整型  -2^15 ---2^15-1
			int i = 1;//整型 (默认类型)  -2^31 ---2^31-1
			long l = 1L;//长整型 -2^63 ---2^63-1
		
			//字符型--->底层转换为数字存放
			char c = '我'; //16位,可以放入中文
			
		
			//浮点数
			float f = 1.0F;//单精度浮点型  32
			double d = 1.0;//双精度浮点型 (默认类型)  64
			
		//布尔型 值为 true false
			boolean bo = true;
			
		
		String str = "aaaaa";//字符串型,不是基本数据类型
	}

}
