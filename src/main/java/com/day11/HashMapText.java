package com.day11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapText {
public static void main(String[] args) {
	Map<String,String> map = new HashMap<>();
	map.put("aaa", "��һ");
	map.put("bbb", "�ڶ�");
	map.put("ccc", "����");
	map.put("ddd", "����");
	map.put("eee", "����");
	System.out.println(map);

//����Map
	//1.�ȱ���key����,��ͨ��get����ȡ��value
	Set<String> keys= map.keySet();
	for(String key:keys){
		System.out.println(key+"-------->"+map.get(key));
	}
	//2.ֱ��ȡ��ֵ����,���б���
	Collection <String> values =map.values();
	for ( String value:values){
		System.out.println(value);
		}
	//3.����ӳ���ϵ����
	Set<Map.Entry<String, String>>entrys = map.entrySet();
	for(Map.Entry<String, String>entry:entrys){
		System.out.println(entry);
	}
	}
}

