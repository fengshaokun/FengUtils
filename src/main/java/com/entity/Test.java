package com.entity;

import java.util.Date;

public class Test {
	/*1.找出所有名字中含有 A的员工对象
	2.按照工资对员工进行降序输出*/
	public static void main(String[] args) {
		Emp emp1 = new Emp(1,"ALLEN","MANAGER",null,5000.0,200.0,10,new Date());
		System.out.println(emp1);

		/*Emp emp2 = new Emp(2,"MARRAY","SALER",1,1000.0,2000.0,10);
		Emp emp3 = new Emp(3,"SCOTT","SALER",1,2000.0,300.0,10);
		Emp emp4 = new Emp(4,"KING","SALER",1,1200.0,2500.0,10);
		Emp emp5 = new Emp(5,"WORD","SALER",1,3000.0,2200.0,10);
		
		Emp[] emps = {emp1,emp2,emp3,emp4,emp5};*/
		
		/*for(Emp e:emps){
			if(e.getEname().contains("a")||e.getEname().contains("A")){
				System.out.println(e);
			}
		}*/
		/*for(int i=0;i<emps.length-1;i++){//轮次
			for(int j=0;j<emps.length-1-i;j++){//每轮中比较的次数
				if(emps[j].getSal()<emps[j+1].getSal()){//比较的条件
					//前一个数和后一个数交换位置
					Emp temp = emps[j];
					emps[j] = emps[j+1];
					emps[j+1] = temp;
				}
				
			}
		}
		for(Emp e:emps){
			System.out.println(e);
		}
		*/
	}

}
