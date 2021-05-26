package com.day7._final;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father(100);
		/*f.x = 1000;
		f.y = 1000;*/
		System.out.println(f.x);//创建类时定死
		System.out.println(f.y);//创建对象时定死
		
		Father f1 = new Father(44);
	}

}
