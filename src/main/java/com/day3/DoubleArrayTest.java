package com.day3;

public class DoubleArrayTest {

	public static void main(String[] args) {
		int[] ia = {1,2,3,4,5};//一维数组
		
		// 行   列
		int[] [] da = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		System.out.println(da.length);
		da[0][2] = 99;
		for(int[] ii:da){
			for(int num:ii){
				System.out.print(num+"\t");
			}
			System.out.print("\n");
		}
		
	}

}
