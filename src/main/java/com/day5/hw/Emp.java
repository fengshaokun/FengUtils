package com.day5.hw;

public class Emp {
	protected String name;
	protected int age;
	protected String sex;
	protected double sal;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, int age, String sex, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public void work(){
		System.out.println("员工要工作");
	}
	
	public double earn(){
		double menoy = sal*12;
		System.out.println("员工要挣钱,"+name+"挣了"+menoy+"元");
		return menoy;
	}
}
