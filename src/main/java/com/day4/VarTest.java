package com.day4;

import java.util.Arrays;

public class VarTest {
	
	public void game(String[]  names){
		System.out.println("����"+names.length+"��������");
		for(int i = 0;i<names.length;i++){
			System.out.println("������"+i+"�ֱ���"+names[i]);
		}
	}
	
	//JDK1.5����,����ʹ�ÿɱ䳤����(0-N��):������ͬ���͵Ĳ���
	//����ֻ�ܶ���Ϊ�����������������͵�����д��
	public void game1(String...names){
		System.out.println("����"+names.length+"��������");
		for(int i = 0;i<names.length;i++){
			System.out.println("������"+i+"�ֱ���"+names[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarTest vt = new VarTest();
		/*String[]  names = {"zs","ls","ww","aa"};
		vt.game(names);*/
		
		//�ɱ䳤�����ĵ���
		//vt.game1();
		//vt.game1("aaa");
		//vt.game1("aaa","bbb");
		//vt.game1("aaa","bbb","ccc");
		String[]  names = {"zs","ls","ww","aa"};
	//	vt.game1(names);
		Arrays.sort(names);
		
	}

}
