package com.day5.hw;

public class Worker extends Emp{

	@Override
	public void work() {
		System.out.println("��������ˮ�߹���");
	}

	@Override
	public double earn() {
		System.out.println("����ֻ�л�������");
		return super.earn();
	}
	
}