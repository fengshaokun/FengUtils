package com.day11;

import com.day10.work.Student;

import java.util.*;

public class MapWork3 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "����", 90, 85, 75);
		Student s2 = new Student(2, "����", 60, 75, 85);
		Student s3 = new Student(3, "����", 50, 65, 95);
		Student s4 = new Student(4, "����", 80, 75, 75);
		Student s5 = new Student(5, "����", 70, 65, 85);
		Student s6 = new Student(6, "�Ʒ�", 80, 85, 85);
		Student s7 = new Student(7, "����", 70, 45, 35);
		Student s8 = new Student(8, "����", 60, 95, 60);

		// ����ģ��С��
		Student[] group1 = { s1, s2 };
		Student[] group2 = { s3, s4 };
		Student[] group3 = { s5, s6 };
		Student[] group4 = { s7, s8 };

		// setģ��༶
		Set<Student[]> class1 = new HashSet<>();
		class1.add(group1);
		class1.add(group2);

		Set<Student[]> class2 = new HashSet<>();
		class2.add(group3);
		class2.add(group4);

		// listģ��ѧУ
		List<Set<Student[]>> school1 = new ArrayList<>();
		school1.add(class1);
		List<Set<Student[]>> school2 = new ArrayList<>();
		school2.add(class2);

		Map<String, List<Set<Student[]>>> area = new HashMap<>();
		area.put("һ��", school1);
		area.put("����", school2);

		Set<String> keys = area.keySet();
		//������Ϊ��,���ֳ��ֵĴ���Ϊֵ
		Map<String, Integer> map = new HashMap<>();
		//����ͳ�Ʊ�area������ѧ�����ֳ��ֵĴ���
		for (String key : keys) {
			List<Set<Student[]>> school = area.get(key);
			for (Set<Student[]> classs : school) {
				for (Student[] students : classs) {
					for (Student student : students) {
						if (map.get(student.getName()) == null) {
							map.put(student.getName(), 1);
						} else {
							map.put(student.getName(), map.get(student.getName()) + 1);
						}

					}
				}
			}
		}
		System.out.println(map);
		//����ѧ��,��ͳ��counter������,value��ֹΪ1�ľ�������
		for (String key : keys) {
			List<Set<Student[]>> school = area.get(key);
			for (Set<Student[]> clazz : school) {
				for (Student[] group : clazz) {
					for (Student s : group) {
						if (map.get(s.getName()) > 1) {
							System.out.println(s);
						}
					}
				}
			}
		}
	}
}
