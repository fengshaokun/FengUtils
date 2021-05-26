package com.day7;

public class TestString {

	public static void main(String[] args) {
		//基本数据类型使用==比较;引用数据类型使用equals进行比较内容(一般要重写)
//		 String str3 = "abc";
//		 String str4 = "abc";
//		 
//		 System.out.println(str3==str4);
//		 System.out.println(str3.equals(str4));
//		 
//		 String str1 = new String("aaa");
//		 String str2 = new String("aaa");
//		 System.out.println(str1==str2);
//		 System.out.println(str1.equals(str2));
		 
		//
		/*String str = "abcdefg";
		char[] sa = str.toCharArray();//将目标字符串 转为 字符数组
		System.out.println(Arrays.toString(sa));
		
		System.out.println(str.charAt(0));//取出第一个字符
		System.out.println(str.charAt(str.length()-1));//取出最后一个字符
*/
		//按字典顺序比较字符串:将相同index的字符进行比较,如相同则比较下一个,并返回差值
		/*String str = "abaggg";
		String str1 = "abbaaa";
		System.out.println(str.compareTo(str1));*/
		
		/*String str = "我正";
		System.out.println(Arrays.toString(str.getBytes()));*/
		
		/*String str = "abcdc";
		System.out.println(str.indexOf('c'));//返回指定字符第一次出现的下标
*/		
		/*String str = "abcdcbc";
		//将原字符串中所有的c转为*,并生产一个新字符串
		String str1 =  str.replace("c", "*");
		System.out.println(str1);
		*/
		
		//按照指定的字符拆分字符串
		/*String str = "11+22-33";
		String[] sa = str.split("[+-]");
		System.out.println(Arrays.toString(sa));*/
		
		//截取指定的子字符串
		/*String str = "abcdefg";
		String str1 = str.substring(2);//从指定下标开始,截取到末尾
		String str2 = str.substring(2,5);//2包括,5不包括  ----->左闭右开
		System.out.println(str2);*/
		
		
		String str3 = "    abcdefg     ";
		System.out.println(str3.trim());
	}

}
