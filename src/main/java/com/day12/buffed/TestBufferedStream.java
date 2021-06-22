package com.day12.buffed;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

//字节缓冲流:高效的进行文件的输入和输出
public class TestBufferedStream {

	public static void main(String[] args) throws Exception {
		//1. 打开一个指向指定文件的流对象	
		InputStream is = new FileInputStream("D:/fengshaokun/5000/xuexi.txt");
		
		//2.将is作为缓冲流构造方法的参数
		BufferedInputStream bis = new BufferedInputStream(is);
		
		//3.使用缓冲流重写的方法进行读取操作
		byte[] temp = new byte[is.available()];
		bis.read(temp);

		String str = new String(temp);
		System.out.println(str);
		
		//4.只需释放装饰流的资源即可
		bis.close();
	}

}
