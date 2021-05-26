package com.day2.work;

import java.util.Scanner;

public class IFWork {

	public static void main(String[] args) {
		//1.
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个4位整数");
		int num = sc.nextInt();
		
		//1000 <= num <10000
		if(1000 <= num &&  num <10000){
			int thou = num/1000;
			int hum = num%1000/100;
			int ten = num%100/10;
			int unit =num%10 ;
			System.out.println("各位数字的和为:"+(thou+hum+ten+unit));
		}else{
			System.out.println("输入的不是4位整数");
		}*/
		
		//2.
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个0-100的数");
		int score = sc.nextInt();
		if(score<0||score>100){
			System.out.println("输入错误");
		}else if(score<60){
			System.out.println("张三的成绩为D");
		}else if(score<=70){
			System.out.println("张三的成绩为C");
		}else if(score<=80){
			System.out.println("张三的成绩为B");
		}else if(score<=99){
			System.out.println("张三的成绩为A");
		}else {
			System.out.println("张三的成绩为S");
		}
	}

}
