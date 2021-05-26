package com.day10;

import com.day8.hw.Emp;
import com.util.DateUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Setset {
public static void main(String[] args) {
	Set <String> set = new HashSet<>();
	//增加元素
	set.add("KING");
	set.add("fsd");
	set.add("hgj");
	set.add("wrt");
	set.add("jkhj");
	//先遍历
for(String str:set){
	String temp1=str.substring(0, 1);//取出首字母
	String temp2=str.substring(1);//取出首字母以外的数字
	String first=temp1.toUpperCase();//首字母转大写
	String other=temp2.toLowerCase();//字母小写
	System.out.println(first+other);
}
	
Emp emp1 = new Emp(7521,"WARD","SALER",7698,1500.0,200.0,30, DateUtils.stringToDateUpdate("1982-12-31"));
Emp emp2 = new Emp(2,"MARRAY","SALER",1,1000.0,2000.0,10, DateUtils.stringToDateUpdate("1985-2-2"));
Emp emp3 = new Emp(3,"SCOTT","SALER",1,2000.0,300.0,10, DateUtils.stringToDateUpdate("1981-11-31"));
Emp emp4 = new Emp(4,"KING","SALER",1,1200.0,2500.0,10, DateUtils.stringToDateUpdate("1985-6-11"));
Emp emp5 = new Emp(5,"WORD","SALER",1,3000.0,2200.0,10, DateUtils.stringToDateUpdate("1984-12-31"));
//放入集合
List<Emp>list = new ArrayList<>();
list.add(emp1);list.add(emp2);list.add(emp3);
list.add(emp4);list.add(emp5);
// 利用set集合相同的元素只能放入一个
Set <Double> set1 = new HashSet<>();
for (Emp e:list){
set1.add(e.getSal());
}
System.out.println(set1);

}
}
