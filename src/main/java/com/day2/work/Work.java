package com.day2.work;

import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//接受一个键盘输入的值,并计算其各位数字的和
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个4位整数");
		int num = sc.nextInt();//1122
		
		int thou = num/1000;
		int hum = num%1000/100;
		int ten = num%100/10;
		int unit =num%10 ;
		
		
		System.out.println(thou);
		System.out.println(hum);
		System.out.println(ten);//alt +/
		System.out.println(unit);
		
		System.out.println(thou+hum+ten+unit);
	}

}
