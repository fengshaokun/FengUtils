package com.day3;

public class ArrayMethods {
	public static void main(String[] args) {
		
	//	int[] ia1 = {56,1,2,3,7,4,0,4,11};
		//1.遍历---->将数组中元素一个个取出
			//while
		
			//for
		/*	for(int i=0;i<ia1.length;i++){
				System.out.println("第"+i+"个值["+ia1[i]+"]");
			}*/
			
			//forEach:专门用于遍历容器的循环
			/*for(int num:ia1){
				System.out.println(num);
			}*/

		//2.取最值
			//max
		/*	int[] ia = {1,2,3,7,4,0,56,4,11,};
			int max = ia[0];
			for(int num:ia){
				max= max<num?num:max;
			}
			System.out.println("max:"+max);*/
			
			//min
			/*int min = ia[0];
			for(int num:ia){
				min= min<num?min:num;
				//if(min<num){min=num;}
			}
			System.out.println("min:"+min);*/
		
		//某个值的下标
		//找出ia中4出现的第一个下标  4最后一次出现的下标
		/*int[] ia = {1,2,3,7,4,0,56,4,11,55};
		int target = 4;
		int index = -1;//-1不是正确的下标,默认4没有出现
		
		for(int i=0;i<ia.length;i++){
			if(target==ia[i]){
				index= i;
				break;//找到4第一次出现,就退出循环;没有break,找的是最后一次出现
			}
		}
		System.out.println(index);*/
		
		//4.数组的复制
		/*int[] ia = {1,2,3,7,4,0,56,4,11,55};
		int[] ia1 = new int[ia.length];
		for(int i=0;i<ia1.length;i++){
			ia1[i] = ia[i];
		}
		System.out.println(Arrays.toString(ia1));
		System.out.println(ia==ia1);*/
		
		//逆序
		/*int[] ia = {1,2,3,7,4,8,7};//最多换位length/2次
		for(int i=0;i<ia.length/2;i++){
			int temp = ia[i];
			ia[i] = ia[ia.length-1-i];
			ia[ia.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(ia));*/
		
	}
}
