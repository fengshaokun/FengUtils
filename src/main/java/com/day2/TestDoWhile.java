package com.day2;

public class TestDoWhile {

	public static void main(String[] args) {
		// ����ִ��1��
		int i=101;//1.ѭ����
		do{
			System.out.println("����ѧ��java-->"+i);
			i++;//3.��ѭ�����������˳������Ĳ���
		}while(i<=100);//2.ѭ���ܹ�ִ�е�����(boolean)

		
//		int i=101;
//		while(i<=100){
//			System.out.println("����ѧ��java-->"+i);
//			i--;//3.��ѭ�����������˳������Ĳ���
//		}
		
		do{
			System.out.println("����ѧ��java-->"+i);
			i--;//3.��ѭ�����������˳������Ĳ���
		}while(i>=100);
	}

}
