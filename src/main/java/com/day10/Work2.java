package com.day10;

import com.day9.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Work2 {
public static void main(String[] args) {
	Student s1 = new Student("张三",90,85,75);
	Student s2 = new Student("李四",60,75,85);
	Student s3 = new Student("李四",50,65,95);
	Student s4 = new Student("王五",80,75,75);
	Student s5 = new Student("王二",70,65,85);
	Student s6 = new Student("菲菲",80,85,85);
	Student s7 = new Student("张三",70,45,35);

	Set<Student> c1 = new HashSet<>(); // 1班
	c1.add(s1);
	c1.add(s2);
	c1.add(s3);
	Set<Student> c2 = new HashSet<>(); // 2班
	c2.add(s4);
	c2.add(s5);
	Set<Student> c3 = new HashSet<>(); // 3班
	c3.add(s6);
	c3.add(s7);
	//使用list模拟学校
	List<Set<Student>> school = new ArrayList<>();
	school.add(c1);
	school.add(c2);
	school.add(c3);
	for(Set<Student> clazz:school){
		for(Student s:clazz){
			//if(s.getJava()>=80){
			System.out.println(s);
				
		}System.out.println();
		}
	}	
}

