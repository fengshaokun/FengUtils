package com.day2.work;

public class ForWork {

	public static void main(String[] args) {
	//1.�ҵ�101-999֮���ˮ�ɻ���  153 = 1*1*1 +5*5*5+3*3*3 
		/*for(int i=101;i<=999;i++){
			int hum = i/100;
			int ten = i%100/10;
			int unit = i%10;
			int sum = hum*hum*hum+ten*ten*ten+unit*unit*unit;
			if(sum==i){
				System.out.println(i+"��ˮ�ɻ���");
			}
			
		}*/
		
	/*2.����a+aa+aaa+aaaa....
	a�ɼ�������
	���һ������λ��Ҳ�ɼ�������*/
		/*Scanner sc = new Scanner(System.in);
		System.out.println("������a");
		int a = sc.nextInt();
		System.out.println("���������һλ����λ��");
		int count = sc.nextInt();
		
		int temp = a;//�����ʼֵ
		int sum = 0;//��
		
		//1  4  1+11+111+1111   ǰһ����*10+��ʼ�� = ��һ�������������
		for(int i=1;i<=count;i++){
			sum += a;
			if(i<count){
				System.out.print(a+"+");
			}else{
				System.out.print(a);
			}
			a = a*10+temp;//��һ�������������a =  ǰһ����*10+��ʼ��
		}
		
		System.out.println("="+sum);*/
		
		
		
	//3.����һ����,�����ַֽ�������  90=2*3*3*5  7 = 7 2=2   8 = 2*2*2
			/*1.��ѭ���Ӵ�2��ʼ,һ�����Ĳ�������;��ൽ������ֵı���;
			2.ѭ����==���ֵı���,�˳�ѭ��  --break
			3.ѭ�����ܹ�������Ŀ��������,��������;��һ��Ҫ���������Ŀ����=Ŀ����/��ǰѭ����
			4.��������������,ѭ����+1*/
		/*int num = 80;
		System.out.print(num+"=");
		for(int i = 2;i<=num;){
			if(i==num){//���һ������
				System.out.print(i);
				break;//�˳�ѭ��
			}else if(num%i==0){//��ѯ�����������������
				System.out.print(i+"*");
				num = num/i;
			}else{
				i++;
			}
			
		}*/
		
	//4.���99�˷��ھ�
		/*	1.������,�ߺ͵�  --->2��ѭ��,һ�������,һ�������
			2.�ߺ͵׶��Ǵ�1��ʼ,��ൽ9(���п���);�׵����ֵ=��ǰ�еĸ�  ---->�߿��Ƶ�
			3.��ǰ�еĵ׽����Ժ�,����--->ÿ����,�׵�ѭ��������,����	*/
	for(int h=1;h<=9;h++){
		for(int w = 1;w<=h;w++){
			System.out.print(h+"*"+w+"="+h*w+"\t");
		}
		//System.out.print("\n");
		System.out.println();
	}	
		
	}

}
