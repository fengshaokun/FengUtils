package com.day12.buffed;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

//�ֽڻ�����:��Ч�Ľ����ļ�����������
public class TestBufferedStream {

	public static void main(String[] args) throws Exception {
		//1. ��һ��ָ��ָ���ļ���������	
		InputStream is = new FileInputStream("D:/fengshaokun/5000/xuexi.txt");
		
		//2.��is��Ϊ���������췽���Ĳ���
		BufferedInputStream bis = new BufferedInputStream(is);
		
		//3.ʹ�û�������д�ķ������ж�ȡ����
		byte[] temp = new byte[is.available()];
		bis.read(temp);

		String str = new String(temp);
		System.out.println(str);
		
		//4.ֻ���ͷ�װ��������Դ����
		bis.close();
	}

}
