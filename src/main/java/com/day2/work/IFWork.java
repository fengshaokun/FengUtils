package com.day2.work;

import java.util.Scanner;

public class IFWork {

	public static void main(String[] args) {
		//1.
		/*Scanner sc = new Scanner(System.in);
		System.out.println("������һ��4λ����");
		int num = sc.nextInt();
		
		//1000 <= num <10000
		if(1000 <= num &&  num <10000){
			int thou = num/1000;
			int hum = num%1000/100;
			int ten = num%100/10;
			int unit =num%10 ;
			System.out.println("��λ���ֵĺ�Ϊ:"+(thou+hum+ten+unit));
		}else{
			System.out.println("����Ĳ���4λ����");
		}*/
		
		//2.
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��0-100����");
		int score = sc.nextInt();
		if(score<0||score>100){
			System.out.println("�������");
		}else if(score<60){
			System.out.println("�����ĳɼ�ΪD");
		}else if(score<=70){
			System.out.println("�����ĳɼ�ΪC");
		}else if(score<=80){
			System.out.println("�����ĳɼ�ΪB");
		}else if(score<=99){
			System.out.println("�����ĳɼ�ΪA");
		}else {
			System.out.println("�����ĳɼ�ΪS");
		}
	}

}
