package com.day12.buffed;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

//�ַ�������
public class TestBufferedChar {

	public static void main(String[] args) throws Exception {
		//1.��һ��ָ��ָ���ļ�������������
		Reader reader = new FileReader("D:/fengshaokun/5000/xuexi.txt");
		
		//2.��reader��Ϊ���������췽���Ĳ���
		BufferedReader br = new BufferedReader(reader);
		
		//3.�ַ���������������һ�ζ�ȡ�ı��ļ���һ����Ȼ��
		int i = 0;
		while(br.ready()){
			String str =  br.readLine();
			i++;
			if(i==2||i==3){
				System.out.println(str);
			}
			
		}
		
		//4.�ͷ���Դ
		br.close();
		
	}

}
