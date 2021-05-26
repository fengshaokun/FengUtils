package com.day7.hw;

public class Test {

	public static void main(String[] args) {
		// 1.	现有字符串表达式 "11+22-33+55”,计算这个表达式的值
	/*	String[] sa =  "11+22-33+55".split("[+-]");
		System.out.println(Arrays.toString(sa));
		int num1 = Integer.parseInt(sa[0]);
		int num2 = Integer.parseInt(sa[1]);
		int num3 = Integer.parseInt(sa[2]);
		int num4 = Integer.parseInt(sa[3]);
		System.out.println(num1+num2-num3+num4);*/
		
		//2.	现有字符串数组[“aba”,”aaa”,””cba”,”cab”,”acd”],将以上数组进行冒泡排序,
		/*String[] sa ={"aba","aaa","cba","cab","acd"};
		for(int i=0;i<sa.length-1;i++){//轮次
			for(int j=0;j<sa.length-1-i;j++){//每轮中比较的次数
				if(sa[j].compareTo(sa[j+1])>0){//比较的条件
					//前一个数和后一个数交换位置
					String temp = sa[j];
					sa[j] = sa[j+1];
					sa[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(sa));*/
		
		//3.使用Scanner输入一串手机号码,如12345678911,将中间5位替换为”*”
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入11位手机号");
		String phoneId = sc.next();
		if(phoneId.length()!=11){
			System.out.println("手机号格式不对");
		}else{
			String temp1 = phoneId.substring(0,3);
			String temp2 = phoneId.substring(phoneId.length()-3);
			System.out.println("电话号码显示为:"+temp1+"*****"+temp2);
		}*/
		
		
		
	}

}
