package com.day12;

import com.day9.Student;

import java.util.Comparator;

public class StudentCountCom implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getCount().compareTo(o1.getCount());
	}

}
