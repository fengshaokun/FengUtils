package com.day2.work;

public class WhileWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i = 100;
		while(i>=1){
			System.out.print(i+" ");
			i--;
		}*/
		
		int i = 10000;
		while(i<=99999){
			int tenthou = i/10000;
			int thou = i%10000/1000;
			int ten = i%100/10;
			int unit = i%10;
		
			if(tenthou==unit && thou==ten){
				System.out.println(i+"是一个回文数");
			}
			i++;
		}

	}

}
