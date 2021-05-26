package com.day8.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//throws:用在方法后,抛出可能出现的异常类型,
//抛出非受检异常:没有意义;java不会检查下一个调用者是否对异常进行了处理
//抛出受检异常:通知下一个调用者,必须对异常进行处理
public class TestThrows {

	public static Date stringToDate1(String dateStr) throws ParseException{
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(dateStr);
	}
	
	public static void fun(int num1,int num2)  throws ArithmeticException{
		System.out.println(num1/num2);
	}
	
	public static void main(String[] args) {
		/*String dateStr = "1980-1-1";
		Date date = stringToDate1(dateStr);
		*/
		fun(1,0);
	}

}
