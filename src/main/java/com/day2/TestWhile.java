package com.day2;

public class TestWhile {

	public static void main(String[] args) {
		
		int i=1;//1.循环子
		while(i<=10)//2.循环能够执行的条件(boolean)
		{
			System.out.println("我能学好java-->"+i);
			i++;//3.将循环子趋向于退出条件的操作
		}
		System.out.println("-----------------------");
		
		while(i<=10)//2.循环能够执行的条件(boolean)
		{
			
			i++;//3.将循环子趋向于退出条件的操作
		}
		System.out.println("我能学好java-->"+i);
	}

}
