package com.day10.work;

import java.util.Comparator;

public class C implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getC().compareTo(o1.getC());
	}

}
