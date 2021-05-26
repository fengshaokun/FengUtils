package com.day8.exception;

public class TestExce {

	public static void main(String[] args) {
		
//RuntimeException
		//ArithmeticException:算术异常
		//	int i = 1/0;		
		
		//java.lang.ArrayIndexOutOfBoundsException:数组下标越界  ---->3
//		int[] ia= {1,2,3,4};
//		ia[4] = 10;
		
		//java.lang.NullPointerException:空指针异常----->1
//		String str = null;
//		System.out.println(str.length());
	
		//StringIndexOutOfBoundsException:字符串下标越界
//		String str= "aaa";
//		System.out.println(str.charAt(3));
		
		//ClassCastException: 类型转换异常 ------>2
//		Person p = new Person();
//		Student s = (Student)p;
		
		
		//受检异常
		//ParseException:解析异常
	//	Date date =  new SimpleDateFormat("yyyy-MM").parse("1999-10");
		
		//ClassNotFoundException:类找不到异常
		//Class.forName("java.text.SimpleDateFormat");
		
		// FileNotFoundException:文件找不到异常
	//	FileInputStream fis = new FileInputStream("D:/1.txt");
	}

}

class Person{}

class Student extends Person {}
