package com.day12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestInputStream {

	public static void main(String[] args) throws IOException {
		//1.打开一个指向指定文件的输入流对象
		InputStream is = new FileInputStream("D:/fengshaokun/5000/xuexi.txt");
		
		//2.进行读取操作
			//1.一次性读取多个字节
			//使用byte数组接收读取的字节(is.available():流中字节的个数)
			byte[] temp = new byte[is.available()];
			//将内容读入到byte数组中
			is.read(temp);
			//数据的处理(不同文件类型不同)
			String str = new String(temp);
			System.out.println(str);
			
			//2.一次读取单个字节
//			String str = "";
//			int num = 0;
//			while((num=is.read())!=-1){
//				str = str+(char)num;
//			}
//			System.out.println(str);
		
		
		//3.关闭资源
			is.close();
		
	}
}
