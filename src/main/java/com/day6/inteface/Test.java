package com.day6.inteface;

public class Test {

	public static void main(String[] args) {
	//	FigureInte fis = new FigureInte();
		FigureInte fis = new FigureImpl();//接口回调
		fis.getArea();
		fis.getPer();
	}

}
