package com.day7._static;

public class Person extends Object{
	//��Ա����:����Ȩ�Ƕ���;ÿ���µĶ���ĳ�Ա��ֵ����Ӱ��
	public String name;
	
	//��̬����:�����, ʹ�÷���Ϊ����.��Ա
	public static String country="�й�";
	
	public void shout(){
		System.out.println("�ҵ�������:"+name);
		
		//��static�������������ĵ���static����
		System.out.println("�����ڹ��ҵ�������:"+country);
		
		//��static�������������ĵ���static����
		fun1();
	}
	
	//��̬����:����Ȩ����,static����ʹ�÷���Ϊ����.����;���Բ���������,ֱ������.��������
	public static void fun1(){
		//static�������������ĵ���static����
		System.out.println("�����ڹ��ҵ�������:"+country);
		
		//static�������ܵ��÷�static�����ͷ���
//		System.out.println("�ҵ�������:"+this.name);//����ʹ��this,static�������Բ���������
//		this.shout();
	}
	
}
