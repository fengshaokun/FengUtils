package com.day6.polymorphic;

public class Test {
	public static void fun(int  x){//������Խ���int����,�����Խ��ܷ�ΧС��int������
		System.out.println(x);
	}
	
	public static void fun1(Animal a){//������Խ���Animal����,���ܽ���Animal����������
		a.eat();
		System.out.println(a);
	}
	
	
	
	public static void main(String[] args) {
		//�����������͵�ת��
		byte b = 1;
	//	fun('a');
		int i = 1;//�Զ�����ת��  jvm
		
	//	b = (byte)i;//ǿת   ����Ա
		
		
		
		//�����������͵�ת��
		//����ת����ǰ��:2�����ͼ���-->����������
		//�����������͵��Զ�����ת��:��������Զ�ת��Ϊ����
		Herbivore hb = new Herbivore();
		hb.eat();
		Predator pd = new Predator();
	
		Animal a  =  pd;//��Herbivore���� hb��ֵ����Animalʹ��;�����Ǳ��Animal����
		a.eat();
		
		
		
		
		//�����������͵�ǿ������ת��:���಻���Զ�ת��Ϊ����;�����ɵ�����ǿ��ת��Ϊ����
		/*hb = (Herbivore)a;
		hb.eat();*/
		
		/*Animal a  = new  Animal();
		Herbivore	hb = (Herbivore)a;*/

	}

}
