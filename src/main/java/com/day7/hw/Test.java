package com.day7.hw;

public class Test {

	public static void main(String[] args) {
		// 1.	�����ַ������ʽ "11+22-33+55��,����������ʽ��ֵ
	/*	String[] sa =  "11+22-33+55".split("[+-]");
		System.out.println(Arrays.toString(sa));
		int num1 = Integer.parseInt(sa[0]);
		int num2 = Integer.parseInt(sa[1]);
		int num3 = Integer.parseInt(sa[2]);
		int num4 = Integer.parseInt(sa[3]);
		System.out.println(num1+num2-num3+num4);*/
		
		//2.	�����ַ�������[��aba��,��aaa��,����cba��,��cab��,��acd��],�������������ð������,
		/*String[] sa ={"aba","aaa","cba","cab","acd"};
		for(int i=0;i<sa.length-1;i++){//�ִ�
			for(int j=0;j<sa.length-1-i;j++){//ÿ���бȽϵĴ���
				if(sa[j].compareTo(sa[j+1])>0){//�Ƚϵ�����
					//ǰһ�����ͺ�һ��������λ��
					String temp = sa[j];
					sa[j] = sa[j+1];
					sa[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(sa));*/
		
		//3.ʹ��Scanner����һ���ֻ�����,��12345678911,���м�5λ�滻Ϊ��*��
		/*Scanner sc = new Scanner(System.in);
		System.out.println("������11λ�ֻ���");
		String phoneId = sc.next();
		if(phoneId.length()!=11){
			System.out.println("�ֻ��Ÿ�ʽ����");
		}else{
			String temp1 = phoneId.substring(0,3);
			String temp2 = phoneId.substring(phoneId.length()-3);
			System.out.println("�绰������ʾΪ:"+temp1+"*****"+temp2);
		}*/
		
		
		
	}

}
