package com.day2.work;

public class ForWork {

	public static void main(String[] args) {
	//1.找到101-999之间的水仙花数  153 = 1*1*1 +5*5*5+3*3*3 
		/*for(int i=101;i<=999;i++){
			int hum = i/100;
			int ten = i%100/10;
			int unit = i%10;
			int sum = hum*hum*hum+ten*ten*ten+unit*unit*unit;
			if(sum==i){
				System.out.println(i+"是水仙花数");
			}
			
		}*/
		
	/*2.计算a+aa+aaa+aaaa....
	a由键盘输入
	最后一个数的位数也由键盘输入*/
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入a");
		int a = sc.nextInt();
		System.out.println("请输入最后一位数的位数");
		int count = sc.nextInt();
		
		int temp = a;//保存初始值
		int sum = 0;//和
		
		//1  4  1+11+111+1111   前一个数*10+初始数 = 后一个参与运算的数
		for(int i=1;i<=count;i++){
			sum += a;
			if(i<count){
				System.out.print(a+"+");
			}else{
				System.out.print(a);
			}
			a = a*10+temp;//后一个参与运算的数a =  前一个数*10+初始数
		}
		
		System.out.println("="+sum);*/
		
		
		
	//3.输入一个数,将数字分解质因数  90=2*3*3*5  7 = 7 2=2   8 = 2*2*2
			/*1.将循环子从2开始,一个个的参与运算;最多到这个数字的本身;
			2.循环子==数字的本身,退出循环  --break
			3.循环子能够被数字目标数整除,就是因数;下一个要参与运算的目标数=目标数/当前循环子
			4.不满足以上条件,循环子+1*/
		/*int num = 80;
		System.out.print(num+"=");
		for(int i = 2;i<=num;){
			if(i==num){//最后一个因数
				System.out.print(i);
				break;//退出循环
			}else if(num%i==0){//查询除本身外的其他因数
				System.out.print(i+"*");
				num = num/i;
			}else{
				i++;
			}
			
		}*/
		
	//4.输出99乘法口诀
		/*	1.三角形,高和底  --->2个循环,一个输出高,一个输出底
			2.高和底都是从1开始,最多到9(自行控制);底的最大值=当前行的高  ---->高控制底
			3.当前行的底结束以后,换行--->每轮中,底的循环结束后,换行	*/
	for(int h=1;h<=9;h++){
		for(int w = 1;w<=h;w++){
			System.out.print(h+"*"+w+"="+h*w+"\t");
		}
		//System.out.print("\n");
		System.out.println();
	}	
		
	}

}
