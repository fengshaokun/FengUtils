package com.day5.��װ;

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
		//==�Ƚϵ��Ƕ������õĵ�ַ�Ƿ�һ��
		System.out.println(dept==dept1);
		
		//equals��δ��д֮ǰ,���ǰ���==���бȽ�;��д��,�ɳ���Աָ���Ƚ�����,�������ݵıȽ�
		System.out.println(dept.equals(dept1));//
		
	
		
		
		
		
	}

}
