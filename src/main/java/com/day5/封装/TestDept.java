package com.day5.封装;

public class TestDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept dept = new Dept();
		dept.setDeptno(10);
		dept.setDname("xiaoshou");
		dept.setLoc("nanjing");
		
		Dept dept1 = new Dept();
		dept1.setDeptno(10);
		dept1.setDname("xiaoshou");
		dept1.setLoc("nanjing1111");
		
		System.out.println(dept1);
		//==比较的是对象引用的地址是否一致
		System.out.println(dept==dept1);
		
		//equals在未重写之前,还是按照==进行比较;重写后,由程序员指定比较条件,进行内容的比较
		System.out.println(dept.equals(dept1));//
		
	
		
		
		
		
	}

}
