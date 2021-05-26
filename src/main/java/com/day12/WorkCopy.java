package com.day12;

import java.io.*;

public class WorkCopy {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("D:/fengshaokun/2000/xuexi.txt");
		String str = "";
		int num = 0;
		while ((num = is.read()) != -1) {
			str = str + (char) num;
		}
		System.out.println(str);
		is.close();

		File file = new File("D:/fengshaokun/3000/xuexi.txt");
		file.createNewFile();
		OutputStream os = new FileOutputStream("D:/fengshaokun/3000/xuexi.txt");
		byte[] temp = str.getBytes();
		os.write(temp);
		os.flush();
		os.close();
	}
}
