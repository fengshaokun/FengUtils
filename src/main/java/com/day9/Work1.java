package com.day9;

import java.util.ArrayList;
import java.util.List;

public class Work1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(22);
		list.add(11);
		list.add(6);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(7);
		list.remove(2);
		
		for(int i=list.size()-1;i>=0;i--){
		if(list.get(i).equals(2)){
			list.remove(i);
		}
		}
		for(Integer a : list){
			System.out.println(a);
		}
	
		}
		}
		
	


	


