package com.day7._final;
/**
 *  final��ǵ��಻�ܱ��̳� ;final��ķ���û�л�����д
 *  final��ǵķ������ܱ�������д
 *  final��ǵı���(��Ա������ֲ�����)����Ϊ������ֻ�ܸ�ֵһ�Ρ� 
 * */
public  class Father {
	final int x = 1;//Father���x,�ڱ��������ʹ��ʱ,ֻ��1��ֵ,Ϊ1
	final int y;//final�հ�,�����ڹ��췽���и�ֵ;ÿ��������һ���Լ���final����y
	public Father(int y) {
		super();
		this.y = y;
	}
	public  void  fun1(){
		final String name = "aaa";
		System.out.println(name);
	};
	public  void  fun2(){};
	public  void  fun3(){};
	public final void  fun4(){};
}


/*class Son extends Father{
	public  void  fun1(){};
	public  void  fun2(){};
	public  void  fun3(){};
//	public  void  fun4(){};
}*/