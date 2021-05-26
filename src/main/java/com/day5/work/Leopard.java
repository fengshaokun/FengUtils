package com.day5.work;

public class Leopard extends Predator{
	public void run(){
		super.run();//调用父类的成员
		System.out.println("豹子跑的飞快");
	}
}
