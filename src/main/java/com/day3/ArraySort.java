package com.day3;

import java.util.Arrays;

public class ArraySort {
	
	/*{6,2,3,7,4,8}
	���ִ� :length-1

	��0��    5��   length-1-0
	{2,6,3,7,4,8}
	{2,3,6,7,4,8}
	{2,3,6,7,4,8}
	{2,3,6,4,7,8}
	{2,3,6,4,7,   8}



	��1��    4��   length-1-1
	{2,3,6,4,7,   8}
	{2,3,6,4,7,   8}
	{2,3,4,6,7,   8}
	{2,3,4,6,     7,8}


	��2��    3��   length-1-2
	{2,3,4,6,     7,8}
	{2,3,4,6,     7,8}
	{2,3,4,       6,7,8}


	��3��    2��  length-1-3
	{2,3,4,       6,7,8}
	{2,3,         4,6,7,8}


	��4��    1��  length-1-4
	{2,3,4,6,7,8}
	*/
	
	public static void main(String[] args) {
		int[] ia = {9,6,2,3,7,4,8};
		int[] ia1= Arrays.copyOf(ia,3);
		
	//	Arrays.sort(ia);
		System.out.println(Arrays.toString(ia1));
		/*System.out.println("��ʼ:"+Arrays.toString(ia)+"");
		for(int i=0;i<ia.length-1;i++){//�ִ�
			System.out.println("\n��"+(i+1)+"��");
			for(int j=0;j<ia.length-1-i;j++){//ÿ���бȽϵĴ���
				if(ia[j]>ia[j+1]){//�Ƚϵ�����
					//ǰһ�����ͺ�һ��������λ��
					int temp = ia[j];
					ia[j] = ia[j+1];
					ia[j+1] = temp;
				}
				System.out.println("��"+(j+1)+"�αȽ�:"+Arrays.toString(ia)+"");
			}
		}*/
		
		
		
	}

}
