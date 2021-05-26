package com.day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException{
		//1970-1-1 00:00:00---当前时间的毫秒数:时间戳
	/*	Date date = new Date();//获取当前系统时间
		System.out.println(date.getTime());//获取当前系统时间的时间戳
		
		//24小时后的时间
		long time = date.getTime()+24L*60*60*1000;
		Date newDate = new Date(time);//获取指定毫秒数的时间
		System.out.println(newDate);*/

		//对日期进行格式化  
		// 日期类型  ---格式化---> 字符串
		/*Date date = new Date();
		//1.确定格式化的模板
		String partten = "yyyy-MM-dd HH:mm:ss E";
		
		//2.使用指定模板,创建格式化对象
		SimpleDateFormat sdf = new  SimpleDateFormat(partten);
		
		//3.使用format方法进行格式化
		String str =  sdf.format(date);
		System.out.println(str);*/
		
		
		// 字符串 ---解析---> 日期类型
		String dateStr = "1980/1/1 14:00:00";
		//1.确定解析的模板,要与目标字符串一致
		String partten = "yyyy/MM/dd HH:mm:ss";
		
		//2.使用指定模板,创建格式化对象
		SimpleDateFormat sdf = new  SimpleDateFormat(partten);
		
		//3.使用parse方法进行格式化
		Date date =  sdf.parse(dateStr);
		
		System.out.println(date);
		
	}

}
