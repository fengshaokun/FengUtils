package com.day10.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentTest {
public static void main(String[] args) {

String[] ss = {"4#张三#90#85#70","2#李思思#91#75#66","1#王三#80#85#90","3#张酒#91#81#71"};
List<Student>list = new ArrayList<>();
for(String s:ss){
	String []temp=s.split("[#]");
	Student stu=new Student(Integer.valueOf(temp[0]),
			temp[1],
			Integer.valueOf(temp[2]),
			Integer.valueOf(temp[3]),
			Integer.valueOf(temp[4])
	          	);
	list.add(stu);
}

			Java java=new Java();
			Collections.sort(list,java);
			
			System.out.println("Java第一名"+list.get(0));
			System.out.println("Java第二名"+list.get(1));
			
			C c=new C();
			Collections.sort(list,c);
			
			System.out.println("C第一名"+list.get(0));
			System.out.println("C第二名"+list.get(1));
			
			Count count=new Count();
			Collections.sort(list,count);
			
			System.out.println("Count第一名"+list.get(0));
			System.out.println("Count第二名"+list.get(1));
			
}
}

