package com.day12;

import java.io.File;

public class TestDir {

	public static void main(String[] args) {
		File file = new File("D:/2000");
		
	//	file.mkdir();//���뱣֤��Ŀ¼����
	//	file.mkdirs();//����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼��
		
	//	file.delete();//ֻ��ɾ����Ŀ¼

		//����Ŀ¼���ļ����ַ���������
		/*String[] names = file.list();
		for(String name:names){
			System.out.println(name);
		}*/
		
		//����Ŀ¼���ļ��Ķ�������
		/* File[] files = file.listFiles();
		 System.out.println("Ŀ¼");
		 for(File f:files){
			 if(f.isDirectory()){
				 System.out.println(f);
			 }
		 }
		*/
	}

}
