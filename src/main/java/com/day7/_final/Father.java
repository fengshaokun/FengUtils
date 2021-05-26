package com.day7._final;
/**
 *  final标记的类不能被继承 ;final类的方法没有机会重写
 *  final标记的方法不能被子类重写
 *  final标记的变量(成员变量或局部变量)即成为常量，只能赋值一次。 
 * */
public  class Father {
	final int x = 1;//Father类的x,在被本类对象使用时,只有1个值,为1
	final int y;//final空白,必须在构造方法中赋值;每个对象都有一个自己的final变量y
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