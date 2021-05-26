package com.day5.封装;

public class Person {
	String name;
	//1.使用private修饰age
	private int age;//年龄要在0-130之间
	String sex;
	String country;
	
	//2.定义两个方法--->通过公共的方法,提供修改和获取private属性的接口
	//获取的方法
	public int getAge(){
		return this.age;
	}
	
	//修改的方法
	public void setAge(int age){
		if(age<0||age>=130){
			System.out.println("年龄超出范围,不合法,为默认值");
			return;
		}
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", country=" + country + "]";
	}
	
	
}
