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
		System.out.println("�����10��ֵ");
		double[]  da = new double[10];
		for(int i =0;i<da.length;i++){
			System.out.println("�������"+(i+1)+"��ֵ");
			da[i] = sc.nextDouble();
		}
		System.out.println(Arrays.toString(da));
		for(int i=0;i<da.length-1;i++){
			System.out.println("\n��"+(i+1)+"��");
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
		System.out.println("�����������,��ʼ��������Ϸ");
		Scanner sc = new Scanner(System.in);
		for(int i=1;true;i++){
			int mynum = sc.nextInt();//����µ�����
			if(num==mynum){
				System.out.println("��������,������,����"+i+"��");
				break;//�������Ժ��˳�ѭ��
			}else {
				String msg = mynum<num?"С":"��";
				System.out.println(msg+"��,�ٲ�");
			}
		}
		
	}
}