package com.day2;

public class TestDoWhile {

	public static void main(String[] args) {
		// 至少执行1次
		int i=101;//1.循环子
		do{
			System.out.println("我能学好java-->"+i);
			i++;//3.将循环子趋向于退出条件的操作
		}while(i<=100);//2.循环能够执行的条件(boolean)

		
//		int i=101;
//		while(i<=100){
//			System.out.println("我能学好java-->"+i);
//			i--;//3.将循环子趋向于退出条件的操作
//		}
		
		do{
			System.out.println("我能学好java-->"+i);
			i--;//3.将循环子趋向于退出条件的操作
		}while(i>=100);
	}

}
