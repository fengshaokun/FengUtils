package com.day2;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int i = sc.nextInt();
		
		//1.������������,��ִ��{}�е����,����,ʲôҲ����
		if(i>2)
		{
			System.out.println("i>2");
		}
		
		//2.������������,��ִ��if��{}�е����,����,ִ��else��{}�е����
		/*if(i>2){
			System.out.println("i>2");
		}else{
			System.out.println("i<=2");	
		}
		*/
		
		//3.���������һ������,��ִ��if��{}�е����,����,�����ж�else if�������;��һ����������.ִ��else
		/*if(i<0){
			System.out.println("i<0");
		}else if(i==0){
			System.out.println("i=0");
		}else if(i==1){
			System.out.println("i=1");
		}else{
			System.out.println("i>=2");	
		}*/
	}

}
