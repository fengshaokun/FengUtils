package com.day6.access.a;

public class SuperClass {
	//˽�е�ֻ���ڶ��������ʹ��
	private  String privateVar="˽�����ε�����";
	
	//������ֻ�ܶ���İ���ʹ��
	String  defaultVar="�����ε�����";
	
	//�ܱ������ο�����ͬ����ʹ��,������������ʹ��
	protected String protectedVar="�ܱ������ε�����";
	
	//��������û�з��ʿ���,ֻҪ��ͬһ����Ŀ�Ϳ���ʹ��
	public  String publicVar="�������ε�����";
	
	
	public void test(){
		System.out.println(privateVar);
		System.out.println(defaultVar);
		System.out.println(protectedVar);
		System.out.println(publicVar);
	}
	
}
