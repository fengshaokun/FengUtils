package com.day5.hw;

public class Scientist extends Emp{
	private double yearEndBonus;//���ս�

	public Scientist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Scientist(String name, int age, String sex, double sal,double yearEndBonus) {
		super(name, age, sex, sal);
		this.yearEndBonus = yearEndBonus;
	}

	@Override
	public void work() {
		System.out.println("��ѧ�ҵĹ������о�");
	}

	@Override
	public double earn() {
		double money = sal*12+yearEndBonus;
		System.out.println("��ѧ�Ҳ����й���,�������ս�,����Ϊ:"+money+"Ԫ");
		return money;
	}
	
	
}
