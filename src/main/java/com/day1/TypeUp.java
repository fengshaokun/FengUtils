package com.day1;

public class TypeUp {
	//1
	{
	//	System.out.println(oo);//�ȶ����ʹ��
		int  oo = 1;
		System.out.println(oo);
		{
			int iner = 2;
			System.out.println(oo);
			System.out.println(iner);
		}
		
	//	System.out.println(iner);//����������Χ
	}
	
	//2.
	{
	//	System.out.println(oo);
	}
	
	public static void main(String[] args) {
		//��������:��byte short char��������ʱ,�Զ�����Ϊint����
		
	/*	��һ�����е�byte�͡�short�ͺ�char��ֵ����������int�͡� 
		�ڶ������һ����������long�ͣ�����������long�ͣ� 
		���������һ����������float�ͣ�����������float�ͣ� 
		���ģ����һ����������double�ͣ�����������double�͡� */

		/*byte b = 1;
		byte b1 =1;
		byte b2 = (byte)(b+b1);//����+���� = ����
*/		
		
		byte b = -128; 
		short s = 10;
		int i = 1;
		long l = 2;
	
		char c = '��';
		
	
		//������
		float f = 1.0F;
		double d = 1.0;
		
		double f1 =  (b+i)+(s+f)+(c+l)+d;
		
	}

}
