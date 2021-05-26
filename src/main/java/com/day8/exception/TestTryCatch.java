package com.day8.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTryCatch {
	/*try { 尝试执行,
			有可能出现异常的代码
	} catch (ParseException e) {如果出现异常,JVM会将异常信息打包为异常对象;
		//执行catch块内的语句
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
		}catch (Exception e) {//父类异常必须在子类异常之后捕获
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date);
		
		System.out.println("<------------------------------------>");
		
	}

}
