package com.day6.polymorphic.work.a;

public class Printer {
	protected String type;

	
	public Printer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Printer(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void print(){
		System.out.println("打印机可以打印");
	}
	
}
