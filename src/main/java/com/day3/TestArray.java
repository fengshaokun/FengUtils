package com.day3;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		//1.��������--->�涨������������ֺ�����Ԫ������
		int[] ia ;
		//int ia1[];
		
		//2.��ʼ������--->������������и�ֵ
		  //1.��̬��ʼ��--->��������������������Ԫ�صĳ�ʼ����ֵ�ֿ�����;
		    //java���Զ�����Ԫ�����͸���Ԫ�س�ʼֵ
			ia = new int[5];
			System.out.println(Arrays.toString(ia));
			//����һ���µ��������,���涨����ĳ���;
//			/**������±��0��ʼ,��ia.length-1����*/
//			ia[0] = 1;//�������еĵ�һ��Ԫ�ظ�ֵΪ1
//			ia[1] = 2;
//			ia[ia.length-1] = 5;
//			System.out.println(ia.length);
//			System.out.println(Arrays.toString(ia));
		  
		  //2.��̬��ʼ��--->��������������������Ԫ�صĸ�ֵͬʱ����
			/*ia = new int[]{1,2,3,4};//�ɸ�ֵ�ĸ��� ���صĹ涨����ĳ���
			System.out.println(ia.length);
			System.out.println(Arrays.toString(ia));*/
		
			//ͬʱ������������,����ĳ�ʼ��,����Ԫ�صĳ�ʼ����ֵ
		/*	int[] ia1 = {1,2,3,4};
			System.out.println(ia1.length);
			System.out.println(Arrays.toString(ia1));
			
			ia1[2]  = 1000;
			System.out.println(Arrays.toString(ia1));*/
	}

}
