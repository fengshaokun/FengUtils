package com.day2;

public class TestOperation {

	public static void main(String[] args) {
		//算术运算符
		/*int i = 1+1;//2
		int i1 = 1-2;//-1
		int i2 = 4*4;//16
		int i3 = 3/4;//0
		System.out.println(i3);
		double  d = 3/4;//0.0
		System.out.println(d);
		double  d1 = 3/4.0;//0.75
		System.out.println(d1);
		
		double  dd1 = 3/2*1.0;//1.0
		double  dd = 1.0*3/2;//1.5
		System.out.println(dd);
		
		int  ii4 = 11%3;//2
		System.out.println(ii4);
		
		String str = "11";
		String str1 = "22";
		System.out.println(str+str1+11);//+代表连接符
*/		
		/*int i= 1;
		//int i1 = i++ +1;//  i+1=2  i=i+1 
		int i1 = ++i +1;//i=i+1  i+1
		System.out.println("i="+i);
		System.out.println("i1="+i1);*/
		
		//比较运算符
		/*int i = 1;
		System.out.println(i==2);
		*/
		
		//逻辑运算符 比较的两边都必须是boolean
		System.out.println(1==1/1 & 2==4/2);
		System.out.println(1==2/1 | 2==4/2);
		System.out.println(true^true);//两边不一样为true
		System.out.println(!true);//取反
		
		
	//	System.out.println(false & 1/0==2);//&:即使左边为false,右边还是参与运算
	//	System.out.println(false && 1/0==2);//&&:如左边为false,右边不参与运算
		
	// 三元运算符
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = sc.nextInt();
		int y = num>0?num:-num;
		System.out.println(y);*/
		
	// 位运算符:先转为2进制数,然后每一位按规则运算
		/*int i = 10;//1010
		int j = 2;// 0010
		System.out.println(i&j);// 0010
		System.out.println(i|j);//1010
		System.out.println(i^j);//1000
*/		
		
	}

}
