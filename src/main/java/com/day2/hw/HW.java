package com.day2.hw;

public class HW {

	public static void main(String[] args) {
		//1. ��1+2!+3!
		/*int num = 1;
		long sum = 0L;
		for(int i=1;i<=3;i++){
			num *=i;
			sum+=num;
		}
		System.out.println(sum);
		*/
		
		/*2.���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ��; 
		 * �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
		 * �Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
		����10���������ٳ�ʱ����ֻʣ��һ�������ˡ�
		���һ�칲ժ�˶��١� */
		// 1 4 10             ----------->2*(n+1)
		int count = 1;//��10��
		for(int i= 9;i>=1;i--){
			count = 2*(count+1);
			System.out.println("��"+i+"���������Ϊ:"+count);
		}

		/*
		3.��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
		С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ�������
		�ʵ�24���µ������ܶ������٣�*/
		//1  1  2  3  5  8  13 ....
		int mon1 = 1;
		int mon2 = 1;
		int mon3;
		System.out.println("��1���µ�������:"+mon1);
		System.out.println("��2���µ�������:"+mon2);
		for(int mon = 3;mon<=24;mon++){
			mon3 = mon1+mon2;
			System.out.println("��"+mon+"���µ�������:"+mon3);
			mon1 = mon2;
			mon2 = mon3;
		}
		
		
/*4.�������ͼ��
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
