package com.day12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestOutPutStream {

	public static void main(String[] args) throws IOException {
		//1.��һ��ָ��ָ���ļ������������
		//�ļ��б������,�ļ����Բ�����
			//����ԭ���� 
		OutputStream os = new FileOutputStream("D:/2000/a.txt");
			//����׷��
		//OutputStream os = new FileOutputStream("D:/2000/a.txt",true);
		
		//2.���÷���д��
		String str = "�ҵĵ�һ����д��";
			//1.һ����д��
		byte[] temp = str.getBytes();
		/*	os.write(temp);*/
		
			//2.һ���ֽ�һ���ֽڵ�д��
		for(int i=0;i<temp.length;i++){
			os.write(temp[i]);
		}
		
		//3.ˢ�²��ͷ���Դ
		os.flush();
		os.close();
		
		
	}

}