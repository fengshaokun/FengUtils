package com.day10.zuoye;

import com.day10.work.Student;

import java.util.*;

public class Zuoye {
	public static void main(String[] args) {

		// 1.�ṩ���´���
		Student s1 = new Student(1, "����", 90, 85, 75);
		Student s2 = new Student(2, "����", 60, 75, 85);
		Student s3 = new Student(3, "����", 50, 65, 95);
		Student s4 = new Student(4, "����", 80, 75, 75);
		Student s5 = new Student(5, "����", 70, 65, 85);
		Student s6 = new Student(6, "�Ʒ�", 80, 85, 85);
		Student s7 = new Student(7, "����", 70, 45, 35);
		Student s8 = new Student(8, "����", 60, 95, 55);

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
		class1.add(group4);

		// listģ��ѧУ
		List<Set<Student[]>> list = new ArrayList<>();
		list.add(class1);
		list.add(class2);
		// ����list,��ѯ����ѧ����Ϣ
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
		// ��ѯschool��,java�γ�ǰ3����ѧ������Ϣ
		System.out.println("java�γ�ǰ3����ѧ��");
		Java java = new Java();
		Collections.sort(lists, java);
		System.out.println("Java��һ��" + lists.get(0));
		System.out.println("Java�ڶ���" + lists.get(1));
		System.out.println("Java������" + lists.get(2));
		// ��ѯphp�������ѧ������Ϣ
		System.out.println("PhP�ɼ����������");
		for (Student sb : lists) {
			if (sb.getPhp() != null && sb.getPhp() < 60) {// ���������ж�NUllֵ
				System.out.println(sb);
			}
		}
		System.out.println("�ж��Ƿ���ĳ����");
		// �ַ������ж�NUllֵ
		for (Student sd : lists) {
			if ("����".equals(sd.getName())) {
				System.out.println(sd);
			}
		}
	}
}
