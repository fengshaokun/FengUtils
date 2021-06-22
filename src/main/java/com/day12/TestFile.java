package com.day12;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException {
		//File类的对象代表 文件本身,和内容无关
		File file  = new File("D:/2000/HelloWorld.java");
	//	file.delete(); //删除文件
		
		file.createNewFile();
		
		
		//获取文件完整路径,父目录,文件名
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