package com.day12;

import com.day9.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Zuoye2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("D:/fengshaokun/zuoye/a.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String msg =  br.readLine();//��ȡ��һ��
		List<Student> list = new ArrayList<>();
		//��ȡѧ����Ϣ
		while(br.ready()){
			String[] temp = br.readLine().split("[#]");
			System.out.println(Arrays.toString(temp));
			Student stu = new  Student(	temp[1],
										Integer.valueOf(temp[2]),
										Integer.valueOf(temp[3]),
										Integer.valueOf(temp[4]));
			list.add(stu);
		}
		br.close();
		System.out.println("--------------------------------");
		for(Student s:list){
			System.out.println(s);
		}
		
		//���ñȽ�������
		Collections.sort(list,new StudentCountCom());
		System.out.println("--------------------------------");
		for(Student s:list){
			System.out.println(s);
		}
		
		
		//д��ȥ
		Writer writer = new  FileWriter("D:/2000/B.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write(msg+"#�ܷ�");
		bw.newLine();
		bw.flush();
		
		for(Student s:list){
			String msg1 = "#"+s.getName()+"#"+s.getJava()
					+"#"+s.getC()+"#"+s.getPhp()+"#"+s.getCount();
			bw.write(msg1);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}

}

