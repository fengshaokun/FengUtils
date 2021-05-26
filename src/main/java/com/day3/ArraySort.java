package com.day3;

import java.util.Arrays;

public class ArraySort {
	
	/*{6,2,3,7,4,8}
	总轮次 :length-1

	第0轮    5次   length-1-0
	{2,6,3,7,4,8}
	{2,3,6,7,4,8}
	{2,3,6,7,4,8}
	{2,3,6,4,7,8}
	{2,3,6,4,7,   8}



	第1轮    4次   length-1-1
	{2,3,6,4,7,   8}
	{2,3,6,4,7,   8}
	{2,3,4,6,7,   8}
	{2,3,4,6,     7,8}


	第2轮    3次   length-1-2
	{2,3,4,6,     7,8}
	{2,3,4,6,     7,8}
	{2,3,4,       6,7,8}


	第3轮    2次  length-1-3
	{2,3,4,       6,7,8}
	{2,3,         4,6,7,8}


	第4轮    1次  length-1-4
	{2,3,4,6,7,8}
	*/
	
	public static void main(String[] args) {
		int[] ia = {9,6,2,3,7,4,8};
		int[] ia1= Arrays.copyOf(ia,3);
		
	//	Arrays.sort(ia);
		System.out.println(Arrays.toString(ia1));
		/*System.out.println("初始:"+Arrays.toString(ia)+"");
		for(int i=0;i<ia.length-1;i++){//轮次
			System.out.println("\n第"+(i+1)+"轮");
			for(int j=0;j<ia.length-1-i;j++){//每轮中比较的次数
				if(ia[j]>ia[j+1]){//比较的条件
					//前一个数和后一个数交换位置
					int temp = ia[j];
					ia[j] = ia[j+1];
					ia[j+1] = temp;
				}
				System.out.println("第"+(j+1)+"次比较:"+Arrays.toString(ia)+"");
			}
		}*/
		
		
		
	}

}
