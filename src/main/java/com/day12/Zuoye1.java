package com.day12;

import java.io.*;

public class Zuoye1 {
	public static void main(String[] args) throws IOException {

		File file1 = new File("D:/2000");
		File file2 = new File("D:/3000");
		copy(file1, file2);
	}

	private static void copy(File src, File dest) throws IOException {
		// ����һ�����ļ���
		File newdir = new File(dest, src.getName());
		newdir.mkdir();
		// ��ȡ���ļ��������е��ļ����ļ���listFile(),�洢��File����;
		File[] subfiles = src.listFiles();
		// �ж��Ƿ����ļ�
		for (File subfile : subfiles) {
			if (subfile.isFile()) {
				// �ļ��Ķ�д��io��ֻ�ܶ�д�ļ������ܶ�д�ļ���
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
				// �ݹ����
				copy(subfile, newdir);
			}
		}
	}
}
