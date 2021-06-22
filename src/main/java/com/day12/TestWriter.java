package com.day12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestWriter {

	public static void main(String[] args) throws IOException {
		// 1.打开一个指向指定文件的输出流对象
		Writer writer = new FileWriter("D:/2000/1.txt", true);// true表示追加

		// 2.字符输出流可以直接向文件中写入字符串 \r\n 换行 \t制表符

		writer.write('a');
		writer.write("\r\n我是第二行");
		writer.write("\r\n我是第3行");
		writer.write("\r\n我是第4行");
		writer.write("\r\n我是第5行");

		// 3.
		writer.flush();
		writer.close();
	}

}
