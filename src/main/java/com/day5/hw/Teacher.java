package com.day5.hw;

public class Teacher extends Emp{
	private double classFee;//��ʱ��
	
	
	

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Teacher(String name, int age, String sex, double sal, double classFee) {
		super(name, age, sex, sal);
		this.classFee = classFee;
	}



	public double getClassFee() {
		return classFee;
	}

	public void setClassFee(double classFee) {
		this.classFee = classFee;
	}



	@Override
	public void work() {
		System.out.println("��ʦҪ�Ͽ�");
	}



	@Override
	public double earn() {
		double money = sal*12+classFee*365;
		System.out.println("��ʦ�����л�������,���п�ʱ��,������"+money);
		return money;
	}
	
	
	
}	
