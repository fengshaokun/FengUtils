package com.day11.泛型;

import com.day5.继承.Person;
import com.day5.继承.Student;

public class TestF<V> {
	public String name;
	 
	public V value; //定义时不确定具体类型
	
	 
	 
	 
	 public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public V getValue() {
		return value;
	}




	public void setValue(V value) {
		this.value = value;
	}




	public static void main(String[] args) {
		 TestF<String> tf1 = new TestF<String>();
		 tf1.value = "放入一个字符串";
		 
		 TestF<Integer> tf2 = new TestF<Integer>();
		 tf2.value = 2222;
		 
		 TestF<Person> tf3 = new TestF<Person>();
		 tf3.value =new Person();
		 tf3.value =new Student();
	}
}
