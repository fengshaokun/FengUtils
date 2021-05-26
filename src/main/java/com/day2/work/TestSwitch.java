package com.day2.work;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {

		System.out.println("1.电话业务");
		System.out.println("2.宽带业务");
		System.out.println("3.投诉");
		System.out.println("其他退出");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择");
		int choose= sc.nextInt();
		
		/*if(choose==1){
			System.out.println("进入电话业务");
		}else if(choose==2){
			System.out.println("进入宽带业务");
		}else if(choose==3){
			System.out.println("投诉");
		}else{
			System.out.println("退出系统");
		}*/
		
		//1.JDK1.7  choose只接受 int char short byte ,String,enum
		//2.不能做区间分段
		//3.匹配到第一匹配项,顺序执行代码,直到第一个break或者执行完毕
		switch(choose){
			case 1:
				System.out.println("进入电话业务");
				break;
			case 2:	
				System.out.println("进入宽带业务");
				break;
			case 3:	
				System.out.println("投诉");	
				break;
			default:
				System.out.println("退出系统");
		}
		
	}

}
