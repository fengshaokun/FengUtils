package com.day5.��װ;

public class Person {
	String name;
	//1.ʹ��private����age
	private int age;//����Ҫ��0-130֮��
	String sex;
	String country;
	
	//2.������������--->ͨ�������ķ���,�ṩ�޸ĺͻ�ȡprivate���ԵĽӿ�
	//��ȡ�ķ���
	public int getAge(){
		return this.age;
	}
	
	//�޸ĵķ���
	public void setAge(int age){
		if(age<0||age>=130){
			System.out.println("���䳬����Χ,���Ϸ�,ΪĬ��ֵ");
			return;
		}
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", country=" + country + "]";
	}
	
	
}
