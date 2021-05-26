package com.day10;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

public int compare(String o1, String o2) {
	if(o1.length()== o2.length()){
		return o1.compareTo(o2);
	}
return o1.length()-o2.length();
}
}

