package com.day1;

public class TypeChange {

	public static void main(String[] args) {
	//����ת��:Ŀ��������Դ���� ����   boolean������ת��
		//1.�Զ�����ת��
		//�Զ�����ת��(��������):ȡֵ��ΧС�ı������� �����Զ�תΪ ȡֵ��Χ��ı�������--->��ȫ(Сת��,�Զ�ת)  jvm
		byte b = 1;
		int i = b;
		
		
		//2.ǿ������ת��(��������):ȡֵ��Χ��ı������� �������Զ�תΪ ȡֵ��ΧС�ı�������--->����ȫ(��תС,ǿ��ת)   ����Աǿ��jvm
		
		//b = i;//�������Զ�
		i = 1000;
		
		b = (byte)i;
	//	System.out.println(b);
		
		int i1 = 'c';
	//	System.out.println(i1);
		
		//boolean������ת��
		/*boolean bo = true;
		i1 = (int)bo;*/
		
		double  dd = 1.999999999;
		int ii = (int)dd;
		System.out.println(ii);
	}

}
