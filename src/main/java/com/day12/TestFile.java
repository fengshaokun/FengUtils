package com.day12;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		//File��Ķ������ �ļ�����,�������޹�
		File file  = new File("D:/2000/HelloWorld.java");
	//	file.delete(); //ɾ���ļ�
		
		file.createNewFile();
		
		
		//��ȡ�ļ�����·��,��Ŀ¼,�ļ���
//		System.out.println(file.getPath());
//		System.out.println(file.getParent());
//		System.out.println(file.getName());
//		
//		//
//		System.out.println(file.exists());
//		
//		//
//		System.out.println(file.length());
//		System.out.println(file.lastModified());
		
		
	}
}