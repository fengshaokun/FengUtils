package com.day5.hw;

public class Test {

	public static void main(String[] args) {
/*		Worker worker = new Worker();
		worker.setName("����");
		worker.setAge(20);
		worker.setSex("��");
		worker.setSal(4000.0);
		worker.work();
		worker.earn();*/
		
		Teacher teacher = new Teacher("����",30,"��",6000,350.0);
		teacher.work();
		double sal =  teacher.earn();
		System.out.println(sal);
		
		
		
	}

}
