package com.day6.polymorphic.work.b;

public class Rectangle extends Figure {
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}
	@Override
	public double getPer() {
		// TODO Auto-generated method stub
		return (length+width)*2;
	}
	
	
}
