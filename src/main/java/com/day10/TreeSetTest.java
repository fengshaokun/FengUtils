package com.day10;

import java.util.Arrays;

public class TreeSetTest {

	public static void main(String[] args) {
		Student s1 = new Student("abcaa",90,85,75);
		Student s2 = new Student("aac",90,75,85);
		Student s3 = new Student("bb",50,65,95);
		Student s4 = new Student("b",80,75,75);
		Student s5 = new Student("bcbfff",90,65,85);
		
		Student[] sa = {s1,s2,s3,s4,s5};
		Arrays.sort(sa);
		for(Student s:sa){
			System.out.println(s);
		}
	}
}
