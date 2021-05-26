package com.day12;

import java.io.*;
import java.util.Date;

public class CopyFile {
	//copy文件
	public static void copyFile(String filePath,String dir) throws Exception{
		//创建文件对象,取出目标文件的文件名
		File file = new  File(filePath);
		String name = file.getName();
		
		//创建目标文件夹
		File newDir = new  File(dir);
		newDir.mkdirs();
		
		//输入流读取原文件的内容
		InputStream is = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(is);
		//输出流写入到新文件
		OutputStream os =new FileOutputStream(dir+"/"+name);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		//读取字节,就向新文件写入一个字节
		int num = 0;
		while((num=bis.read())!=-1){
			bos.write(num);
		}
		bos.flush();
		bos.close();
		bis.close();
		System.out.println("copy成功");
		
	}
	
	public static void copyDir(String dirPath,String targetDir) throws Exception{
		//D:\java32\bin
		File dir = new File(dirPath);//待拷贝的文件夹
		
		//从原文件夹下依次遍历,并一个一个的拷贝到新文件夹
		File[] files = dir.listFiles();
		for(File f:files){
			if(f.isFile()){//f是文件就copy
				//D:\java32\bin\awt.dll  ----> D:\2000\bin\awt.dll
				copyFile(f.getPath(),targetDir+"/"+dir.getName());
			}else{//f不是文件,就是目录,那么久需要再一次遍历;调用本身
				//D:\java32\bin\client----->D:\2000\bin\client
				copyDir(f.getPath(),targetDir+"/"+dir.getName());
			}
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		
		/*copyFile("D:/java127/api/JDK_API_1_6_zh_CN.CHM","D:/5000");*/
		copyDir("D:/Java32/bin", "D:/2000");
		Date date1 = new Date();
		System.out.println("共耗时:"+( date1.getTime()-date.getTime())+"毫秒");
		
	}
}

