package com.day8.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//throws:���ڷ�����,�׳����ܳ��ֵ��쳣����,
//�׳����ܼ��쳣:û������;java��������һ���������Ƿ���쳣�����˴���
//�׳��ܼ��쳣:֪ͨ��һ��������,������쳣���д���
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
