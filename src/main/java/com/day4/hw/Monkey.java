package com.day4.hw;

public class Monkey {
	//属性
	String name;//名字
	String type;//类别
	String sex;
	int age;
	String color;
	
	//构造方法
	public Monkey() {
		super();
	}
	public Monkey(String name, String type, String sex, int age, String color) {
		super();
		this.name = name;
		this.type = type;
		this.sex = sex;
		this.age = age;
		this.color = color;
	}
	
	//
	public void run(){
		System.out.println("猴子会跑");
	}
	
	public void jump(){
		System.out.println("猴子会跳");
	}
	
	public void climb(){
		System.out.println("猴子会爬树");
	}
	
	public void eat(int food){
		if(food==1||food==2||food==3){
			System.out.println("猴子"+name+"会开心的吃掉"+food+",并向你笑一笑");	
		}else{
			System.out.println("猴子"+name+"不吃,并将食物向你进行投掷");
		}
	}
	
	public void turn(int num){
		for(int i = 1;i<=num;i++){
			System.out.println("猴子"+name+"开始翻第"+i+"个跟头");
		}
	}
	
	
}
