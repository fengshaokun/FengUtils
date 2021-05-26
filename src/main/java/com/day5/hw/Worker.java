package com.day5.hw;

public class Worker extends Emp{

	@Override
	public void work() {
		System.out.println("工人在流水线工作");
	}

	@Override
	public double earn() {
		System.out.println("工人只有基本工资");
		return super.earn();
	}
	
}
