package com.day12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestInputStream {

	public static void main(String[] args) throws IOException {
		//1.��һ��ָ��ָ���ļ�������������
		InputStream is = new FileInputStream("D:/fengshaokun/5000/xuexi.txt");
		
		//2.���ж�ȡ����
			//1.һ���Զ�ȡ����ֽ�
			//ʹ��byte������ն�ȡ���ֽ�(is.available():�����ֽڵĸ���)
			byte[] temp = new byte[is.available()];
			//�����ݶ��뵽byte������
			is.read(temp);
			//���ݵĴ���(��ͬ�ļ����Ͳ�ͬ)
			String str = new String(temp);
			System.out.println(str);
			
			//2.һ�ζ�ȡ�����ֽ�
//			String str = "";
//			int num = 0;
//			while((num=is.read())!=-1){
//				str = str+(char)num;
//			}
//			System.out.println(str);
		
		
		//3.�ر���Դ
			is.close();
		
	}
}
