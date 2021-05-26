package com.day10;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LengthComparator a = new LengthComparator();
String[] str = {"abbsaa","bdddsaa","hghsdfsdf","aaaadd"};
 Arrays.sort(str,a);
 for(String a1:str){
	 System.out.println(a1);	 
 }
	}
}
