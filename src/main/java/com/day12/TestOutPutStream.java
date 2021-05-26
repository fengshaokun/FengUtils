package com.day12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutPutStream {

	public static void main(String[] args) throws IOException {
		//1.打开一个指向指定文件的输出流对象
		//文件夹必须存在,文件可以不存在
			//覆盖原内容 
		OutputStream os = new FileOutputStream("D:/2000/a.txt");
			//内容追加
		//OutputStream os = new FileOutputStream("D:/2000/a.txt",true);
		
		//2.调用方法写出
		String str = "我的第一个个写出";
			//1.一次性写出
		byte[] temp = str.getBytes();
		/*	os.write(temp);*/
		
			//2.一个字节一个字节的写出
		for(int i=0;i<temp.length;i++){
			os.write(temp[i]);
		}
		
		//3.刷新并释放资源
		os.flush();
		os.close();
		
		
	}

}