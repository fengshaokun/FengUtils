package com.day5.hw;

public class Waiter extends Emp{
	@Override
	public void work() {
		System.out.println("�������ڲ�������");
	}

	@Override
	public double earn() {
		System.out.println("������ֻ�л�������");
		return super.earn();
	}
	
}
