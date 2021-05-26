package com.day3.hw;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//1
		/*int[][][] tda = new int[6][7][8];
		tda[1][2][3] = 11;
		tda[2][4][5] = 99;

		for (int[][] dda : tda) {
			for (int[] da : dda) {
				for (int num : da) {
					System.out.print(num + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}*/
		
		//2.
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请键入10个值");
		double[]  da = new double[10];
		for(int i =0;i<da.length;i++){
			System.out.println("请输入第"+(i+1)+"个值");
			da[i] = sc.nextDouble();
		}
		System.out.println(Arrays.toString(da));
		for(int i=0;i<da.length-1;i++){
			System.out.println("\n第"+(i+1)+"轮");
			for(int j=0;j<da.length-1-i;j++){
				if(da[j]<da[j+1]){
					double temp = da[j];
					da[j] = da[j+1];
					da[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(da));
		System.out.println("max:"+da[0]);
		System.out.println("max:"+da[da.length-1]);*/
		
		
		int num = (int)(Math.random()*100+1);
		System.out.println("随机数已生产,开始猜数字游戏");
		Scanner sc = new Scanner(System.in);
		for(int i=1;true;i++){
			int mynum = sc.nextInt();//输入猜的数子
			if(num==mynum){
				System.out.println("你真厉害,猜中了,猜了"+i+"次");
				break;//猜中了以后退出循环
			}else {
				String msg = mynum<num?"小":"大";
				System.out.println(msg+"了,再猜");
			}
		}
		
	}
}