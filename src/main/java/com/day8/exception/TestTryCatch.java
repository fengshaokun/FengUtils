package com.day8.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTryCatch {
	/*try { ����ִ��,
			�п��ܳ����쳣�Ĵ���
	} catch (ParseException e) {��������쳣,JVM�Ὣ�쳣��Ϣ���Ϊ�쳣����;
		//ִ��catch���ڵ����
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	public static void main(String[] args) {
		String dateStr = "1980-1/1 14:00:00";
		
		String partten = "yyyy/MM/dd HH:mm:ss";
		
		
		SimpleDateFormat sdf = new  SimpleDateFormat(partten);
		

		Date date = null;
		try {
			date = sdf.parse(dateStr);
			Class.forName("java.text.SimpleDateFormat");
			System.out.println("<<------>>");
		}catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {//�����쳣�����������쳣֮�󲶻�
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date);
		
		System.out.println("<------------------------------------>");
		
	}

}
