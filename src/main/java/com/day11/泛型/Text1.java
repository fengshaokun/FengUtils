package com.day11.����;

import java.util.ArrayList;
import java.util.List;
//1.5���� ����:����������,���뼯�Ͽ���е�Ԫ�ص����� �ɵ����߾���
//���͵ķ���
//1.������
//2.���ͽӿ�
//3.���ͷ���

/**
 * ע���:
 * 1.���ͱ����ȶ����ʹ��,�� ����<��������1,��������2>
 * 2.���ͱ�����������������,�����ܻ�����������
 * 3.��������˷���,ʹ��ʱû��ȷ����������,javaĬ��ΪObject����
 * 4.List<String> list = new ArrayList<String>();
 * JDK1.7����,=�ұߵ�<����>�е����Ϳ���ʡ��(�����﷨)
 * 
 * */

public class Text1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bb");

		for(Object o:list){
			System.out.println(o);
		}
	}

}
