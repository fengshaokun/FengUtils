package com.day4;

public class TestMethod {

	public static void main(String[] args) {
		//������ʹ��
		
		//1.�Ƚ�����
		MethodTest mt = new MethodTest();
		
		
		//2.ͨ���������Ͳ������е���
			//2.1û�з���ֵ�ķ���
			//mt.fun1();//û�з���ֵ�ķ���,����ʹ�ñ�������
			//mt.fun2("aca","bab");//�в����ķ���,��������Ӧ�Ĳ���(����,����,˳��)

			//2.2�з���ֵ�ķ���
			//  mt.fun3();//�з��صķ������԰�û�з���ֵ�ķ����ķ�ʽ���е���
//			 int num = mt.fun3();//�з���ֵ�ķ���,����ʹ�ö�Ӧ���͵ı������н���
//			 System.out.println(num);
			 
		int num = 	mt.fun4(44, 33);
		System.out.println(num);
			 
	}

}
