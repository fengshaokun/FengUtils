package com.day9;

import com.day8.hw.Emp;
import com.util.DateUtils;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static List<Emp> getEmps(){
		Emp emp1 = new Emp(7521,"WARD","SALER",7698,1500.0,200.0,30, DateUtils.stringToDateUpdate("1982-12-31"));
		Emp emp2 = new Emp(2,"MARRAY","SALER",1,1000.0,2000.0,10, DateUtils.stringToDateUpdate("1985-2-2"));
		Emp emp3 = new Emp(3,"SCOTT","SALER",1,2000.0,300.0,10, DateUtils.stringToDateUpdate("1981-11-31"));
		Emp emp4 = new Emp(4,"KING","SALER",1,1200.0,2500.0,10, DateUtils.stringToDateUpdate("1985-6-11"));
		Emp emp5 = new Emp(5,"WORD","SALER",1,3000.0,2200.0,10, DateUtils.stringToDateUpdate("1984-12-31"));
		
		List<Emp> list = new ArrayList<>();
		list.add(emp1);list.add(emp2);list.add(emp3);
		list.add(emp4);list.add(emp5);
		return list;
	}
	
	public static void main(String[] args) {
		List<Emp> list  = Test.getEmps();
		EmpDao ed = new EmpDao();
		/*for(Emp e:list){
			System.out.println(e);
		}*/
		
		/*List<Emp> emps = ed.getEmpsBySal(list, 2000.0);
		for(Emp e:emps){
			System.out.println(e);
		}*/
		
		Emp emp1 = new Emp(7666,"KING","SALER",7698,3500.0,200.0,30, DateUtils.stringToDateUpdate("1982-12-31"));
		ed.addEmp(list, emp1);
		for(Emp e:list){
			System.out.println(e);
		}
		System.out.println("------------------------------------");
		
		ed.updateSalbyEmpno(list, 7666, 3000.1);
		for(Emp e:list){
			System.out.println(e);
		}
		
		System.out.println("------------------------------------");
		ed.deleteSalbyEmpno(list, 7666);
		for(Emp e:list){
			System.out.println(e);
		}
	}

}