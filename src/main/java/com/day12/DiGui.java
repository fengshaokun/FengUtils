package com.day12;
//1.算 5的累加 到1
public class DiGui {
	public static int fun(int num){
		if(num==1){
			System.out.print(num);
			return 1;
		}else{
			System.out.print(num+"+");
			return num+fun(num-1);
		}		
	}

  
public static void main(String[] args) {
	int sum = fun(5);
	System.out.println("="+sum);
}
}