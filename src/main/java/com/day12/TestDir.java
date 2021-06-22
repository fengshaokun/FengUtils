package com.day12;

import java.io.File;

public class TestDir {

	public static void main(String[] args) {
		File file = new File("D:/2000");
		
	//	file.mkdir();//必须保证父目录存在
	//	file.mkdirs();//创建目录，包括所有必需但不存在的父目录。
		
	//	file.delete();//只能删除空目录

		//返回目录下文件名字符串的数组
		/*String[] names = file.list();
		for(String name:names){
			System.out.println(name);
		}*/
		
		//返回目录下文件的对象数组
		/* File[] files = file.listFiles();
		 System.out.println("目录");
		 for(File f:files){
			 if(f.isDirectory()){
				 System.out.println(f);
			 }
		 }
		*/
	}

}
