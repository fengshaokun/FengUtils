package com.day8.hw;

import com.util.DateUtils;

public class Test {
	
	public static void queryEmpsByHiredateAfter1985(Emp...emps){
		for(Emp e:emps){
			if(e.getHiredate().after(DateUtils.stringToDateUpdate("1984-12-31"))){
				System.out.println(e);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Emp emp1 = new Emp(1,"ALLEN","MANAGER",null,5000.0,200.0,10,DateUtils.stringToDateUpdate("1982-12-31"));
		Emp emp2 = new Emp(2,"MARRAY","SALER",1,1000.0,2000.0,10,DateUtils.stringToDateUpdate("1985-2-2"));
		Emp emp3 = new Emp(3,"SCOTT","SALER",1,2000.0,300.0,10,DateUtils.stringToDateUpdate("1981-11-31"));
		Emp emp4 = new Emp(4,"KING","SALER",1,1200.0,2500.0,10,DateUtils.stringToDateUpdate("1985-6-11"));
		Emp emp5 = new Emp(5,"WORD","SALER",1,3000.0,2200.0,10,DateUtils.stringToDateUpdate("1984-12-31"));
		
		Emp[] emps = {emp1,emp2,emp3,emp4,emp5};
		
		queryEmpsByHiredateAfter1985(emps);
	}

}
