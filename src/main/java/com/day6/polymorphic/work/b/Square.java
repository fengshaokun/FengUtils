package com.day6.polymorphic.work.b;

public class Square  extends Figure {
	private double length;
	
	public Square(double length) {
		super();
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*length;
	}
	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		return (length+length)*2;
	}
}	
