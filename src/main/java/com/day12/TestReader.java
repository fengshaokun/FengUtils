package com.day12;

import java.io.FileReader;
import java.io.Reader;

public class TestReader {

	public static void main(String[] args) throws Exception {
		//1.��һ��ָ��ָ���ļ�������������
		Reader reader = new FileReader("D:/2000/1.txt");
		
		//2.���ж�ȡ����,�ַ������ַ�Ϊ��λ
		String str = "";
		//һ�ζ�ȡ�����ַ�
		while(reader.ready()){
			str+=(char)reader.read();
		}
		
		System.out.println(str);
		
		//3.�ر���Դ
		reader.close();
		
		
		/*String  str = "�ǵط����ط����ط�";
		System.out.println(Arrays.toString(str.toCharArray()));
		System.out.println(Arrays.toString(str.getBytes()));*/
	}

}
