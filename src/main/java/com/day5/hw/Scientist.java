package com.day5.hw;

public class Scientist extends Emp{
	private double yearEndBonus;//年终奖

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
		System.out.println("科学家的工作是研究");
	}

	@Override
	public double earn() {
		double money = sal*12+yearEndBonus;
		System.out.println("科学家不光有工资,还有年终奖,收入为:"+money+"元");
		return money;
	}
	
	
}
