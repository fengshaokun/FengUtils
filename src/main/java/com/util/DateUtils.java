package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	/**1.�ܹ����������͵Ķ��� תΪ 2019��2��18�� ��ʽ���ַ���*/
	public static String dateToString(Date date){
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy��MM��dd��");
		return sdf.format(date);
	}
	
	/**2.�ܹ���2019-2-18���ַ��� תΪ ��������*//*
	public static Date stringToDate1(String dateStr) throws ParseException{
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(dateStr);
	}
	
	
	*//**3.�ܹ���2019/2/18���ַ��� תΪ ��������*//*
	public static Date stringToDate2(String dateStr) throws ParseException{
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy/MM/dd");
		return sdf.parse(dateStr);
	}*/
	
	/**�ܹ���2019/2/18����2019-2-18���ַ��� תΪ ��������*/
	public static Date stringToDateUpdate(String dateStr){
		Date date = null;
		//�趨��һ��ģ��
		SimpleDateFormat sdf = new  SimpleDateFormat("yyyy/MM/dd");
		try {
			date = sdf.parse(dateStr);
		} catch (ParseException e) {
			sdf = new  SimpleDateFormat("yyyy-MM-dd");
			try {
				date = sdf.parse(dateStr);
			} catch (ParseException e1) {
				System.err.println("ֻ����yyyy-MM-dd����yyyy/MM/dd��ʽ���ַ���");
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
