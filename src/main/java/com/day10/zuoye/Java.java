package com.day10.zuoye;

import com.day10.work.Student;

import java.util.Comparator;

public class Java implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getJava().compareTo(o1.getJava());
	}

}
