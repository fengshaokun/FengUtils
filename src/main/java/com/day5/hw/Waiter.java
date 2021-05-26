package com.day5.hw;

public class Waiter extends Emp{
	@Override
	public void work() {
		System.out.println("服务生在餐厅工作");
	}

	@Override
	public double earn() {
		System.out.println("服务生只有基本工资");
		return super.earn();
	}
	
}
