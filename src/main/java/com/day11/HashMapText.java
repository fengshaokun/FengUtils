package com.day11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapText {
public static void main(String[] args) {
	Map<String,String> map = new HashMap<>();
	map.put("aaa", "第一");
	map.put("bbb", "第二");
	map.put("ccc", "第三");
	map.put("ddd", "第四");
	map.put("eee", "第五");
	System.out.println(map);

//遍历Map
	//1.先遍历key集合,再通过get方法取出value
	Set<String> keys= map.keySet();
	for(String key:keys){
		System.out.println(key+"-------->"+map.get(key));
	}
	//2.直接取出值集合,进行遍历
	Collection <String> values =map.values();
	for ( String value:values){
		System.out.println(value);
		}
	//3.遍历映射关系集合
	Set<Map.Entry<String, String>>entrys = map.entrySet();
	for(Map.Entry<String, String>entry:entrys){
		System.out.println(entry);
	}
	}
}

