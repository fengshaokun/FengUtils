package com.day2.work;

public class TestBreakAndContinue {

	public static void main(String[] args) {
		//continue:��������ѭ����,contiune֮������;����ִ����һ��ѭ��
		//break:������ǰѭ��;��ǰѭ����break֮�����䲻ִ��,û����һ��ѭ��
		//return:������ǰ����
		//System.exit(0):����������JVM
		for(int i = 1;i<=9;i++){
			if(i==5){
			//	continue;
			//	break;
			//	return;
				System.exit(0);
			}
			System.out.print(i+"\t");
		}
		System.out.println("ѭ����");
	}

}
