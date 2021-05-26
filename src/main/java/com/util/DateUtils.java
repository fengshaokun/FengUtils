package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	/**1.能够将日期类型的对象 转为 2019年2月18日 格式的字符串*/
	public static String dateToString(Date date){
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy年MM月dd日");
		return sdf.format(date);
	}
	
	/**2.能够将2019-2-18的字符串 转为 日期类型*//*
	public static Date stringToDate1(String dateStr) throws ParseException{
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(dateStr);
	}
	
	
	*//**3.能够将2019/2/18的字符串 转为 日期类型*//*
	public static Date stringToDate2(String dateStr) throws ParseException{
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy/MM/dd");
		return sdf.parse(dateStr);
	}*/
	
	/**能够将2019/2/18或者2019-2-18的字符串 转为 日期类型*/
	public static Date stringToDateUpdate(String dateStr){
		Date date = null;
		//设定第一种模板
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy/MM/dd");
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			sdf = new  SimpleDateFormat("yyyy-MM-dd");
			try {
				date = sdf.parse(dateStr);
			} catch (ParseException e1) {
				System.err.println("只接受yyyy-MM-dd或者yyyy/MM/dd格式的字符串");
			}
		}
		
		return date;
	}
	
	public static void main(String[] args) throws ParseException {
		
		
		String dateStr = "1980/1-1";
		Date date = DateUtils.stringToDateUpdate(dateStr);
		System.out.println(date);
		
	}
	
	
	
}
