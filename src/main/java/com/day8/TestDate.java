package com.day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException{
		//1970-1-1 00:00:00---��ǰʱ��ĺ�����:ʱ���
	/*	Date date = new Date();//��ȡ��ǰϵͳʱ��
		System.out.println(date.getTime());//��ȡ��ǰϵͳʱ���ʱ���
		
		//24Сʱ���ʱ��
		long time = date.getTime()+24L*60*60*1000;
		Date newDate = new Date(time);//��ȡָ����������ʱ��
		System.out.println(newDate);*/

		//�����ڽ��и�ʽ��  
		// ��������  ---��ʽ��---> �ַ���
		/*Date date = new Date();
		//1.ȷ����ʽ����ģ��
		String partten = "yyyy-MM-dd HH:mm:ss E";
		
		//2.ʹ��ָ��ģ��,������ʽ������
		SimpleDateFormat sdf = new  SimpleDateFormat(partten);
		
		//3.ʹ��format�������и�ʽ��
		String str =  sdf.format(date);
		System.out.println(str);*/
		
		
		// �ַ��� ---����---> ��������
		String dateStr = "1980/1/1 14:00:00";
		//1.ȷ��������ģ��,Ҫ��Ŀ���ַ���һ��
		String partten = "yyyy/MM/dd HH:mm:ss";
		
		//2.ʹ��ָ��ģ��,������ʽ������
		SimpleDateFormat sdf = new  SimpleDateFormat(partten);
		
		//3.ʹ��parse�������и�ʽ��
		Date date =  sdf.parse(dateStr);
		
		System.out.println(date);
		
	}

}
