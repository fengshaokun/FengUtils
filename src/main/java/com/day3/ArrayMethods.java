package com.day3;

public class ArrayMethods {
	public static void main(String[] args) {
		
	//	int[] ia1 = {56,1,2,3,7,4,0,4,11};
		//1.����---->��������Ԫ��һ����ȡ��
			//while
		
			//for
		/*	for(int i=0;i<ia1.length;i++){
				System.out.println("��"+i+"��ֵ["+ia1[i]+"]");
			}*/
			
			//forEach:ר�����ڱ���������ѭ��
			/*for(int num:ia1){
				System.out.println(num);
			}*/

		//2.ȡ��ֵ
			//max
		/*	int[] ia = {1,2,3,7,4,0,56,4,11,};
			int max = ia[0];
			for(int num:ia){
				max= max<num?num:max;
			}
			System.out.println("max:"+max);*/
			
			//min
			/*int min = ia[0];
			for(int num:ia){
				min= min<num?min:num;
				//if(min<num){min=num;}
			}
			System.out.println("min:"+min);*/
		
		//ĳ��ֵ���±�
		//�ҳ�ia��4���ֵĵ�һ���±�  4���һ�γ��ֵ��±�
		/*int[] ia = {1,2,3,7,4,0,56,4,11,55};
		int target = 4;
		int index = -1;//-1������ȷ���±�,Ĭ��4û�г���
		
		for(int i=0;i<ia.length;i++){
			if(target==ia[i]){
				index= i;
				break;//�ҵ�4��һ�γ���,���˳�ѭ��;û��break,�ҵ������һ�γ���
			}
		}
		System.out.println(index);*/
		
		//4.����ĸ���
		/*int[] ia = {1,2,3,7,4,0,56,4,11,55};
		int[] ia1 = new int[ia.length];
		for(int i=0;i<ia1.length;i++){
			ia1[i] = ia[i];
		}
		System.out.println(Arrays.toString(ia1));
		System.out.println(ia==ia1);*/
		
		//����
		/*int[] ia = {1,2,3,7,4,8,7};//��໻λlength/2��
		for(int i=0;i<ia.length/2;i++){
			int temp = ia[i];
			ia[i] = ia[ia.length-1-i];
			ia[ia.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(ia));*/
		
	}
}
