package com.day2.work;

import java.util.Scanner;

public class IfWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个5位数,判断是否是一个回文数");
		int num = sc.nextInt();
		int tenthou = num/10000;
		int thou = num%10000/1000;
		int ten = num%100/10;
		int unit = num%10;
	
		if(tenthou==unit && thou==ten){
			System.out.println(num+"是一个回文数");
		}else{
			System.out.println(num+"不是一个回文数");
		}*/
		
		//2.模拟会员登录
		System.out.println("1.会员注册");
		System.out.println("2.会员登录");
		System.out.println("3.返回上一级");
		System.out.println("4.退出");
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择");
		int choose = sc.nextInt();
		switch(choose){
		case 1:
			System.out.println("进入注册页面");
			break;
		case 2:	
			System.out.println("进入登录页面");
			break;
		case 3:	
			System.out.println("返回上一级");	
			break;
		default:
			System.out.println("退出系统");
	}
	}

}
