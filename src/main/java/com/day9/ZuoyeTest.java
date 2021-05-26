package com.day9;

import com.util.DateUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ZuoyeTest {
public static void main(String[] args) {
	String[] ss = {"7521#WARD#SALESMAN#7698#1981/2/22#1500.00#200.00#30",
"7566#JONES#MANAGER#7839#1981/4/2#2975.00##20",
"7654#MARTIN#SALESMAN#7698#1981/9/28#1250.00#1400.00#30",
"7698#BLAKE#MANAGER#7839#1981/5/1#2850.00##30",
"7782#CLARK#MANAGER#7839#1981/6/9#2450.00##10",
"7788#SCOTT#ANALYST#7566#1987/4/19#3000.00##20",
"7839#KING#PRESIDENT##1981/11/17#5000.00##10",
"7844#TURNER#ASLESMAN#7698#1981/9/8#1500.00#0.00#30",
"7876#ADAMS#CLERK#7788#1987/5/23#1100.00##20",
"7900#JAMES#CLERK#7698#1981/12/3#950##30",
"7902#FORD#ANALYST#7566#1981/12/3#3000.00##20",
"7934#MILLER#CLERK#7782#1982/1/23#1300.00##10"};
	List<Zuoye>list = new ArrayList<>();
	for (String msg:ss){
		String[]sa=msg.split("[#]");
		System.out.println(Arrays.toString(sa));
		Integer empno = Integer.valueOf(sa[0]);
		 String name=sa[1];//员工名
		 String job=sa[2];//工种
	Integer mgr; 
	if(!sa[3].equals("")){
		 mgr=Integer.valueOf(sa[3]);
	 }else{
		 mgr=null;
	 }//上司编号
		 Date hiredate=DateUtils.stringToDateUpdate(sa[4]);//入职
		 Double sal=Double.valueOf(sa[5]);//工资
		 Double comm;
		 if(!sa[6].equals("")){
			 comm=Double.valueOf(sa[6]);
		 }else{
			 comm=null;
		 }
		 //奖金
		Integer deptno=Integer.valueOf(sa[7]);//所在部门号
		Zuoye s = new Zuoye (empno,name,job,mgr,hiredate,sal,comm,deptno);
		list.add(s);	
}
/*	System.out.println(list);
	System.out.println("工资高于的");
Zuoye.compareSal(list, 2500.00);
	Zuoye.setSal(list, 7521, 1000.00);
	System.out.println("修改工资后");*/
	//System.out.println(list);
	//Zuoye.delDmpno(list, 7521);
	//System.out.println(list);
	
	Zuoye.addEmp(list, "7934#大傻逼#CLERK#7782#1982/1/23#1300.00##10");
	Zuoye.addEmp(list, "7934#小傻逼#CLERK#7782#1982/1/23#1300.00##10");
	for(Zuoye e:list){
		System.out.println(e);
	}
	
}
}

