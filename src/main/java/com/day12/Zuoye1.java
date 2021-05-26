package com.day12;

import java.io.*;

public class Zuoye1 {
	public static void main(String[] args) throws IOException {

		File file1 = new File("D:/2000");
		File file2 = new File("D:/3000");
		copy(file1, file2);
	}

	private static void copy(File src, File dest) throws IOException {
		// 创建一个新文件夹
		File newdir = new File(dest, src.getName());
		newdir.mkdir();
		// 获取该文件夹下所有的文件和文件夹listFile(),存储在File数组;
		File[] subfiles = src.listFiles();
		// 判断是否是文件
		for (File subfile : subfiles) {
			if (subfile.isFile()) {
				// 文件的读写，io流只能读写文件，不能读写文件夹
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subfile));
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(new File(newdir, subfile.getName())));
				int b;
				while ((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			} else {
				// 递归调用
				copy(subfile, newdir);
			}
		}
	}
}
