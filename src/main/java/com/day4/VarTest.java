package com.day4;

import java.util.Arrays;

public class VarTest {
	
	public void game(String[]  names){
		System.out.println("共有"+names.length+"个参与者");
		for(int i = 0;i<names.length;i++){
			System.out.println("参与者"+i+"分别是"+names[i]);
		}
	}
	
	//JDK1.5以上,可以使用可变长参数(0-N个):必须是同类型的参数
	//就是只能定义为方法参数的数组类型的特殊写法
	public void game1(String...names){
		System.out.println("共有"+names.length+"个参与者");
		for(int i = 0;i<names.length;i++){
			System.out.println("参与者"+i+"分别是"+names[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarTest vt = new VarTest();
		/*String[]  names = {"zs","ls","ww","aa"};
		vt.game(names);*/
		
		//可变长参数的调用
		//vt.game1();
		//vt.game1("aaa");
		//vt.game1("aaa","bbb");
		//vt.game1("aaa","bbb","ccc");
		String[]  names = {"zs","ls","ww","aa"};
	//	vt.game1(names);
		Arrays.sort(names);
		
	}

}
