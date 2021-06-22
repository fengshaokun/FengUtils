package com.day12.buffed;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

//字符缓冲流
public class TestBufferedChar {

	public static void main(String[] args) throws Exception {
		//1.打开一个指向指定文件的输入流对象
		Reader reader = new FileReader("D:/fengshaokun/5000/xuexi.txt");
		
		//2.将reader作为缓冲流构造方法的参数
		BufferedReader br = new BufferedReader(reader);
		
		//3.字符缓冲输入流可以一次读取文本文件的一个自然行
		int i = 0;
		while(br.ready()){
			String str =  br.readLine();
			i++;
			if(i==2||i==3){
				System.out.println(str);
			}
			
		}
		
		//4.释放资源
		br.close();
		
	}

}
