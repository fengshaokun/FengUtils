package com.day12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestWriter {

	public static void main(String[] args) throws IOException {
		// 1.��һ��ָ��ָ���ļ������������
		Writer writer = new FileWriter("D:/2000/1.txt", true);// true��ʾ׷��

		// 2.�ַ����������ֱ�����ļ���д���ַ��� \r\n ���� \t�Ʊ��

		writer.write('a');
		writer.write("\r\n���ǵڶ���");
		writer.write("\r\n���ǵ�3��");
		writer.write("\r\n���ǵ�4��");
		writer.write("\r\n���ǵ�5��");

		// 3.
		writer.flush();
		writer.close();
	}

}
