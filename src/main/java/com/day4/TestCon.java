package com.day4;

public class TestCon {
	String name;
	int age;
	
	//���췽��:���ڴ�������
	//1.û�з���ֵ����,��ͬ�ڷ���ֵΪvoid
	//2.��������������ͬ
	
	public TestCon(){
		
	}
	
	
	//�вι���
	public TestCon(String aa,int bb){
		name = aa;
		age = bb;
		for(int i=0;i<10;i++){
		System.out.println("a--->"+i);
		}
	}
	
	public  void fun(){
		System.out.println("���Ƿ���");
	}


	@Override
	public String toString() {
		return "TestCon [name=" + name + ", age=" + age + "]";
	}
	
	
}
