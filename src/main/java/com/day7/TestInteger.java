package com.day7;

public class TestInteger {

	public static void main(String[] args) {
		//���/Сֵ�ĳ���
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);

		
//		String str1 = "11";
//		String str2 = "22";
//		System.out.println(str1+str2);
		
		//�ַ���ת����
		//1.String ----> int   Ч�ʸ�
//		int num1 = Integer.parseInt(str1);
//		int num2 = Integer.parseInt(str2);
//		System.out.println(num1+num2);
		
		//2.String ----> Integer
//		Integer num1 = Integer.valueOf(str1);
//		Integer num2 = Integer.valueOf(str2);
//		System.out.println(num1 +num2);
		
		//����ת�ַ���
//		int x = 1;
//		//1.
//		String str = String.valueOf(x);
//		
//		//2.
//		String str = x+"";
		
		//JDK1.5�����ϰ汾:��װ��� �Զ�װ����Զ�����
		int i = 10;
		Integer ii ;
	
		//�Զ�װ��:�������������͵�ֵ---��װ---> ��Ӧ�İ�װ������
		ii = i;//��ͬ�� ii = Integer.valueOf(i);
		System.out.println(ii);
		
		//�Զ�����:����װ�����͵�ֵ  ---����---> �����������͵�ֵ
		//i = ii;
		i = ii.intValue();
		System.out.println(i);

		
	}

}
