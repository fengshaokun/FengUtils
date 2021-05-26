package com.day6;

class Father{
	public  void faFun(){System.out.println("这是父类的fun1方法");}
}

class Son extends Father {
	public  void faFun(){System.out.println("这是子类的fun1方法");}
	public  void sonFun(){System.out.println("这是第一个子类的fun2方法");}
}

class Son1 extends Father {
}


public class Test {

	public static void main(String[] args) {
		/*Father f = new Son();//
		f.faFun();
		
		Son s = (Son)f;
		s.sonFun();*/
		
		Son s1 = new Son();// 正确
		Father f = s1; // 正确
		
		if(f instanceof Son){
			Son s = (Son)f; // 编译正确,运行时错误
			s.faFun();
			s.sonFun();
		}else{
			f.faFun();
		}
		
	}

}
