package com.day2.work;

public class TestBreakAndContinue {

	public static void main(String[] args) {
		//continue:跳过本轮循环中,contiune之后的语句;继续执行下一轮循环
		//break:结束当前循环;当前循环中break之后的语句不执行,没有下一轮循环
		//return:结束当前方法
		//System.exit(0):无条件结束JVM
		for(int i = 1;i<=9;i++){
			if(i==5){
			//	continue;
			//	break;
			//	return;
				System.exit(0);
			}
			System.out.print(i+"\t");
		}
		System.out.println("循环外");
	}

}
