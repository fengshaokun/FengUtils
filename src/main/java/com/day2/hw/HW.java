package com.day2.hw;

public class HW {

	public static void main(String[] args) {
		//1. 求1+2!+3!
		/*int num = 1;
		long sum = 0L;
		for(int i=1;i<=3;i++){
			num *=i;
			sum+=num;
		}
		System.out.println(sum);
		*/
		
		/*2.猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个; 
		 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
		 * 以后每天早上都吃了前一天剩下的一半零一个。
		到第10天早上想再吃时，见只剩下一个桃子了。
		求第一天共摘了多少。 */
		// 1 4 10             ----------->2*(n+1)
		int count = 1;//第10天
		for(int i= 9;i>=1;i--){
			count = 2*(count+1);
			System.out.println("第"+i+"天的桃子数为:"+count);
		}

		/*
		3.有一对兔子，从出生后第3个月起每个月都生一对兔子，
		小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，
		问第24个月的兔子总对数多少？*/
		//1  1  2  3  5  8  13 ....
		int mon1 = 1;
		int mon2 = 1;
		int mon3;
		System.out.println("第1个月的兔子数:"+mon1);
		System.out.println("第2个月的兔子数:"+mon2);
		for(int mon = 3;mon<=24;mon++){
			mon3 = mon1+mon2;
			System.out.println("第"+mon+"个月的兔子数:"+mon3);
			mon1 = mon2;
			mon2 = mon3;
		}
		
		
/*4.输出如下图形
   *   1   1    2*i-1   3   h-i
  ***  2    3			2
 ***** 3    5
*******   */
		int h = 8;
		for(int i = 1;i<=h;i++){
			for(int k = h-i;k>=1;k--){
				System.out.print(" ");
			}
			
			for(int j = 1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = h-1;i>=1;i--){
			for(int k = h-i;k>=1;k--){
				System.out.print(" ");
			}
			
			for(int j = 1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
