package com.day7;

public class TestString {

	public static void main(String[] args) {
		//������������ʹ��==�Ƚ�;������������ʹ��equals���бȽ�����(һ��Ҫ��д)
//		 String str3 = "abc";
//		 String str4 = "abc";
//		 
//		 System.out.println(str3==str4);
//		 System.out.println(str3.equals(str4));
//		 
//		 String str1 = new String("aaa");
//		 String str2 = new String("aaa");
//		 System.out.println(str1==str2);
//		 System.out.println(str1.equals(str2));
		 
		//
		/*String str = "abcdefg";
		char[] sa = str.toCharArray();//��Ŀ���ַ��� תΪ �ַ�����
		System.out.println(Arrays.toString(sa));
		
		System.out.println(str.charAt(0));//ȡ����һ���ַ�
		System.out.println(str.charAt(str.length()-1));//ȡ�����һ���ַ�
*/
		//���ֵ�˳��Ƚ��ַ���:����ͬindex���ַ����бȽ�,����ͬ��Ƚ���һ��,�����ز�ֵ
		/*String str = "abaggg";
		String str1 = "abbaaa";
		System.out.println(str.compareTo(str1));*/
		
		/*String str = "����";
		System.out.println(Arrays.toString(str.getBytes()));*/
		
		/*String str = "abcdc";
		System.out.println(str.indexOf('c'));//����ָ���ַ���һ�γ��ֵ��±�
*/		
		/*String str = "abcdcbc";
		//��ԭ�ַ��������е�cתΪ*,������һ�����ַ���
		String str1 =  str.replace("c", "*");
		System.out.println(str1);
		*/
		
		//����ָ�����ַ�����ַ���
		/*String str = "11+22-33";
		String[] sa = str.split("[+-]");
		System.out.println(Arrays.toString(sa));*/
		
		//��ȡָ�������ַ���
		/*String str = "abcdefg";
		String str1 = str.substring(2);//��ָ���±꿪ʼ,��ȡ��ĩβ
		String str2 = str.substring(2,5);//2����,5������  ----->����ҿ�
		System.out.println(str2);*/
		
		
		String str3 = "    abcdefg     ";
		System.out.println(str3.trim());
	}

}
