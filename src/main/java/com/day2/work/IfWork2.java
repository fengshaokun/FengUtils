package com.day2.work;

import java.util.Scanner;

public class IfWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		System.out.println("������һ��5λ��,�ж��Ƿ���һ��������");
		int num = sc.nextInt();
		int tenthou = num/10000;
		int thou = num%10000/1000;
		int ten = num%100/10;
		int unit = num%10;
	
		if(tenthou==unit && thou==ten){
			System.out.println(num+"��һ��������");
		}else{
			System.out.println(num+"����һ��������");
		}*/
		
		//2.ģ���Ա��¼
		System.out.println("1.��Աע��");
		System.out.println("2.��Ա��¼");
		System.out.println("3.������һ��");
		System.out.println("4.�˳�");
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ��");
		int choose = sc.nextInt();
		switch(choose){
		case 1:
			System.out.println("����ע��ҳ��");
			break;
		case 2:	
			System.out.println("�����¼ҳ��");
			break;
		case 3:	
			System.out.println("������һ��");	
			break;
		default:
			System.out.println("�˳�ϵͳ");
	}
	}

}
