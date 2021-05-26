package com.day8;

public class Person {
	private  String name;
	private Integer age;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		if(age>130){
			/*System.err.println("年龄超出范围");
			return;*/
			//使用throw抛出异常的对象
			throw new AgeException("年龄不能大于130岁:"+age);
		}
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(1000);
		p.setName("zed");
		System.out.println(p);
	}

}
