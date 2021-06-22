package com.day11.泛型;

import java.util.ArrayList;
import java.util.List;
//1.5以上 泛型:参数化类型,放入集合框架中的元素的类型 由调用者决定
//泛型的分类
//1.泛型类
//2.泛型接口
//3.泛型方法

/**
 * 注意点:
 * 1.泛型必须先定义后使用,在 类名<泛型类型1,泛型类型2>
 * 2.泛型必须是引用数据类型,不接受基本数据类型
 * 3.如果定义了泛型,使用时没有确定具体类型,java默认为Object类型
 * 4.List<String> list = new ArrayList<String>();
 * JDK1.7以上,=右边的<类型>中的类型可以省略(菱形语法)
 * 
 * */

public class Text1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bb");

		for(Object o:list){
			System.out.println(o);
		}
	}

}
