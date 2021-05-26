package com.day2;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int i = sc.nextInt();
		
		//1.假如满足条件,就执行{}中的语句,否则,什么也不做
		if(i>2)
		{
			System.out.println("i>2");
		}
		
		//2.假如满足条件,就执行if后{}中的语句,否则,执行else后{}中的语句
		/*if(i>2){
			System.out.println("i>2");
		}else{
			System.out.println("i<=2");	
		}
		*/
		
		//3.假如满足第一个条件,就执行if后{}中的语句,否则,继续判断else if后的条件;如一个都不满足.执行else
		/*if(i<0){
			System.out.println("i<0");
		}else if(i==0){
			System.out.println("i=0");
		}else if(i==1){
			System.out.println("i=1");
		}else{
			System.out.println("i>=2");	
		}*/
	}

}
