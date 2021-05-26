package com.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList {
public static void main(String[] args) {
	String[] ss = {"张三#90#85#70","李思思#91#75#66","王三#80#85#90","张酒#91#81#71"};
	List<Student>list = new ArrayList<>();
	for (String msg:ss){
	String[]sa=msg.split("[#]");
	System.out.println(Arrays.toString(sa));
	
	//所需的属性
	String name = sa[0];
	Integer java = Integer.valueOf(sa[1]);
	Integer c = Integer.valueOf(sa[2]);
	Integer php = Integer.valueOf(sa[3]);
	//创建的对象
	Student s = new Student(name,java,c,php);
	list.add(s);	
}
	for(Student a:list){
		System.out.println(a);	
	}
	System.out.println("排序前--------------------");
	
	for(int i=0;i<list.size()-1;i++){
		for(int j=0;j<list.size()-1-i;j++){
			if(list.get(j).getCount()<list.get(j+1).getCount()){
			
				Student temp;
				temp=list.get(j);
				list.set(j,list.get(j+1));
				list.set(j+1, temp);	
			}		
		}
		}	System.out.println("排序后------------------");
		for(Student b:list){
			System.out.println(b);	
	}
}
}

