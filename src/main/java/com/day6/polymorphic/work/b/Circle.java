package com.day6.polymorphic.work.b;

public class Circle extends Figure {
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
	}

	
	public double getR() {
		return r;
	}


	public void setR(double r) {
		this.r = r;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

	

	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		return 2*3.14*r;
	}
	
	
}
