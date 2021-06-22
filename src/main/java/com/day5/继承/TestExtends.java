package com.day5.继承;

public class TestExtends {

	public static void main(String[] args) {
		/*Person p = new  Person();
		p.name = "aaa";
		p.run();
		
		
		Student s = new Student();
		s.name="xues";
		s.run();
		*/
		
		
		SmallStudent ss  = new SmallStudent();
		ss.name="小";
		ss.run();
		ss.sid = 10;
		ss.study();
		
		ss.stest();
		
	}

}
