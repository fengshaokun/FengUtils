package com.day6.inteface;

public class Test {

	public static void main(String[] args) {
	//	FigureInte fis = new FigureInte();
		FigureInte fis = new FigureImpl();//�ӿڻص�
		fis.getArea();
		fis.getPer();
	}

}
