package com.day2.work;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {

		System.out.println("1.�绰ҵ��");
		System.out.println("2.���ҵ��");
		System.out.println("3.Ͷ��");
		System.out.println("�����˳�");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ��");
		int choose= sc.nextInt();
		
		/*if(choose==1){
			System.out.println("����绰ҵ��");
		}else if(choose==2){
			System.out.println("������ҵ��");
		}else if(choose==3){
			System.out.println("Ͷ��");
		}else{
			System.out.println("�˳�ϵͳ");
		}*/
		
		//1.JDK1.7  chooseֻ���� int char short byte ,String,enum
		//2.����������ֶ�
		//3.ƥ�䵽��һƥ����,˳��ִ�д���,ֱ����һ��break����ִ�����
		switch(choose){
			case 1:
				System.out.println("����绰ҵ��");
				break;
			case 2:	
				System.out.println("������ҵ��");
				break;
			case 3:	
				System.out.println("Ͷ��");	
				break;
			default:
				System.out.println("�˳�ϵͳ");
		}
		
	}

}
