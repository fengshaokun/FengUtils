package com.day8.exception;

public class TestExce {

	public static void main(String[] args) {
		
//RuntimeException
		//ArithmeticException:�����쳣
		//	int i = 1/0;		
		
		//java.lang.ArrayIndexOutOfBoundsException:�����±�Խ��  ---->3
//		int[] ia= {1,2,3,4};
//		ia[4] = 10;
		
		//java.lang.NullPointerException:��ָ���쳣----->1
//		String str = null;
//		System.out.println(str.length());
	
		//StringIndexOutOfBoundsException:�ַ����±�Խ��
//		String str= "aaa";
//		System.out.println(str.charAt(3));
		
		//ClassCastException: ����ת���쳣 ------>2
//		Person p = new Person();
//		Student s = (Student)p;
		
		
		//�ܼ��쳣
		//ParseException:�����쳣
	//	Date date =  new SimpleDateFormat("yyyy-MM").parse("1999-10");
		
		//ClassNotFoundException:���Ҳ����쳣
		//Class.forName("java.text.SimpleDateFormat");
		
		// FileNotFoundException:�ļ��Ҳ����쳣
	//	FileInputStream fis = new FileInputStream("D:/1.txt");
	}

}

class Person{}

class Student extends Person {}
