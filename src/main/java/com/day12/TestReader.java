package com.day12;

import java.io.FileReader;
import java.io.Reader;

public class TestReader {

	public static void main(String[] args) throws Exception {
		//1.打开一个指向指定文件的输入流对象
		Reader reader = new FileReader("D:/2000/1.txt");
		
		//2.进行读取操作,字符流以字符为单位
		String str = "";
		//一次读取单个字符
		while(reader.ready()){
			str+=(char)reader.read();
		}
		
		System.out.println(str);
		
		//3.关闭资源
		reader.close();
		
		
		/*String  str = "是地方撒地方撒地方";
		System.out.println(Arrays.toString(str.toCharArray()));
		System.out.println(Arrays.toString(str.getBytes()));*/
	}

}
