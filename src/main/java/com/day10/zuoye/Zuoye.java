package com.day10.zuoye;

import com.day10.work.Student;

import java.util.*;

public class Zuoye {
	public static void main(String[] args) {

		// 1.提供如下代码
		Student s1 = new Student(1, "张三", 90, 85, 75);
		Student s2 = new Student(2, "李四", 60, 75, 85);
		Student s3 = new Student(3, "李四", 50, 65, 95);
		Student s4 = new Student(4, "王五", 80, 75, 75);
		Student s5 = new Student(5, "王二", 70, 65, 85);
		Student s6 = new Student(6, "菲菲", 80, 85, 85);
		Student s7 = new Student(7, "张三", 70, 45, 35);
		Student s8 = new Student(8, "张三", 60, 95, 55);

		// 数组模拟小组
		Student[] group1 = { s1, s2 };
		Student[] group2 = { s3, s4 };
		Student[] group3 = { s5, s6 };
		Student[] group4 = { s7, s8 };

		// set模拟班级
		Set<Student[]> class1 = new HashSet<>();
		class1.add(group1);
		class1.add(group2);

		Set<Student[]> class2 = new HashSet<>();
		class2.add(group3);
		class1.add(group4);

		// list模拟学校
		List<Set<Student[]>> list = new ArrayList<>();
		list.add(class1);
		list.add(class2);
		// 遍历list,查询所有学生信息
		List<Student> lists = new ArrayList<>();
		for (Set<Student[]> a : list) {
			for (Student[] sa : a) {
				for (Student saa : sa) {
					System.out.println(saa);
					lists.add(saa);
				}
				System.out.println();
			}
		}
		// 查询school中,java课程前3名的学生的信息
		System.out.println("java课程前3名的学生");
		Java java = new Java();
		Collections.sort(lists, java);
		System.out.println("Java第一名" + lists.get(0));
		System.out.println("Java第二名" + lists.get(1));
		System.out.println("Java第三名" + lists.get(2));
		// 查询php不及格的学生的信息
		System.out.println("PhP成绩不及格的有");
		for (Student sb : lists) {
			if (sb.getPhp() != null && sb.getPhp() < 60) {// 数字类型判断NUll值
				System.out.println(sb);
			}
		}
		System.out.println("判断是否是某个人");
		// 字符类型判断NUll值
		for (Student sd : lists) {
			if ("李四".equals(sd.getName())) {
				System.out.println(sd);
			}
		}
	}
}
