package com.day6.factory;

public class Factory {
	public  static A createA(){
		return new Ason3();
	}
	public  static A createB(){
		return new Ason2();
	}
}
