package com.day6;

class Father{
	public  void faFun(){System.out.println("���Ǹ����fun1����");}
}

class Son extends Father {
	public  void faFun(){System.out.println("���������fun1����");}
	public  void sonFun(){System.out.println("���ǵ�һ�������fun2����");}
}

class Son1 extends Father {
}


public class Test {

	public static void main(String[] args) {
		/*Father f = new Son();//
		f.faFun();
		
		Son s = (Son)f;
		s.sonFun();*/
		
		Son s1 = new Son();// ��ȷ
		Father f = s1; // ��ȷ
		
		if(f instanceof Son){
			Son s = (Son)f; // ������ȷ,����ʱ����
			s.faFun();
			s.sonFun();
		}else{
			f.faFun();
		}
		
	}

}
