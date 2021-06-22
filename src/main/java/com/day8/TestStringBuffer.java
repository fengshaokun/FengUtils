package com.day8;

public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a"+"b"+"c"+"d";
		
		StringBuffer sb = new StringBuffer();
		sb.append("a").append("b").append("c").append("d");
		
		String str1 = sb.toString();
		System.out.println(str1);
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
	}

}
