package com.day4.hw;

public class Monkey {
	//����
	String name;//����
	String type;//���
	String sex;
	int age;
	String color;
	
	//���췽��
	public Monkey() {
		super();
	}
	public Monkey(String name, String type, String sex, int age, String color) {
		super();
		this.name = name;
		this.type = type;
		this.sex = sex;
		this.age = age;
		this.color = color;
	}
	
	//
	public void run(){
		System.out.println("���ӻ���");
	}
	
	public void jump(){
		System.out.println("���ӻ���");
	}
	
	public void climb(){
		System.out.println("���ӻ�����");
	}
	
	public void eat(int food){
		if(food==1||food==2||food==3){
			System.out.println("����"+name+"�Ὺ�ĵĳԵ�"+food+",������ЦһЦ");	
		}else{
			System.out.println("����"+name+"����,����ʳ���������Ͷ��");
		}
	}
	
	public void turn(int num){
		for(int i = 1;i<=num;i++){
			System.out.println("����"+name+"��ʼ����"+i+"����ͷ");
		}
	}
	
	
}
