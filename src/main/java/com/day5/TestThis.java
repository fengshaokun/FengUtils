package com.day5;

public class TestThis {
	String name;
	int age;
	
	

	public TestThis() {
		//3.ͨ��this(����)����ʽ���õ�ǰ���е��������췽��
		this("aa",11); 
	}
	
	public TestThis(String name,int age) {
		//2.ʹ��this�ؼ���,ָ����ǰ���������;�˴�this����ʡ��
		this.name = name;
		this.age = age;
	}
	
	public  void  fun1(){
		System.out.println("����fun1");
	}
	
	
	
	public  void  fun2(){
		//1.ʹ�õ���fun2()�����ĵ�ǰ���������õ�ǰ�����fun1;----thisָ����ǰ����---
		this.fun1();
		System.out.println("����fun2"+this.name);
		
	}

	
	
	
	public static void main(String[] args) {
		/*TestThis tt = new  TestThis("aa", 17);
		System.out.println(tt.);*/
		TestThis tt1 = new TestThis();
		//���Ժͷ�����Ҫͨ������.�����Ͷ���.���Խ��е���
		
		tt1.fun2();
		
	}

}
