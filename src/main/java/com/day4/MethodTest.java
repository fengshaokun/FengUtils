package com.day4;

public class MethodTest {
	//1.����ֵΪvoid,û�в����ķ���-->fun1
	public void fun1(){
		System.out.println("����һ������ֵΪvoid,û�в����ķ���");
	}
	
	//2.����ֵΪvoid,�������ķ���
	public void fun2(String arg1,String arg2){
	//	fun1();//������ֱ�ӵ���
		System.out.println("����һ������ֵΪvoid,��2�������ķ���");
		System.out.println("����1:"+arg1);
		System.out.println("����2:"+arg2);
	}
	
	//3.�з���ֵ,���������ķ���--->����ֵ��������return���ֵ����
	//return:��ֹ����������;������һ��ֵ
	public int	fun3(){
		int num1 = 100;
		int num2 = 50;
		System.out.println("aaaaa");
		return num1/num2;//2
	}
	
	//4.�з���ֵ,�������ķ���
	public int	fun4(int num1,int num2){
		int sum = num1+num2;
		return sum;
	}

}
