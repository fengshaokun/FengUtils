package com.day12;

import java.io.*;
import java.util.Date;

public class CopyFile {
	//copy�ļ�
	public static void copyFile(String filePath,String dir) throws Exception{
		//�����ļ�����,ȡ��Ŀ���ļ����ļ���
		File file = new  File(filePath);
		String name = file.getName();
		
		//����Ŀ���ļ���
		File newDir = new  File(dir);
		newDir.mkdirs();
		
		//��������ȡԭ�ļ�������
		InputStream is = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(is);
		//�����д�뵽���ļ�
		OutputStream os =new FileOutputStream(dir+"/"+name);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		//��ȡ�ֽ�,�������ļ�д��һ���ֽ�
		int num = 0;
		while((num=bis.read())!=-1){
			bos.write(num);
		}
		bos.flush();
		bos.close();
		bis.close();
		System.out.println("copy�ɹ�");
		
	}
	
	public static void copyDir(String dirPath,String targetDir) throws Exception{
		//D:\java32\bin
		File dir = new File(dirPath);//���������ļ���
		
		//��ԭ�ļ��������α���,��һ��һ���Ŀ��������ļ���
		File[] files = dir.listFiles();
		for(File f:files){
			if(f.isFile()){//f���ļ���copy
				//D:\java32\bin\awt.dll  ----> D:\2000\bin\awt.dll
				copyFile(f.getPath(),targetDir+"/"+dir.getName());
			}else{//f�����ļ�,����Ŀ¼,��ô����Ҫ��һ�α���;���ñ���
				//D:\java32\bin\client----->D:\2000\bin\client
				copyDir(f.getPath(),targetDir+"/"+dir.getName());
			}
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		Date date = new Date();
		
		/*copyFile("D:/java127/api/JDK_API_1_6_zh_CN.CHM","D:/5000");*/
		copyDir("D:/Java32/bin", "D:/2000");
		Date date1 = new Date();
		System.out.println("����ʱ:"+( date1.getTime()-date.getTime())+"����");
		
	}
}

