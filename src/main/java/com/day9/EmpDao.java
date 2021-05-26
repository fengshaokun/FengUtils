package com.day9;

import com.day8.hw.Emp;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	//查询要返回被查出结果
	//从指定的list中查询符合targetSal的结果
	public  List<Emp> queryEmpsBySal(List<Emp> list,double targetSal){
		List<Emp> emps = new ArrayList<>();//查询的结果放入此集合
		for(Emp e:list){
			if(e.getSal()>=targetSal){
				emps.add(e);
			}
		}
		return emps;
	}
	
	//增删改方法一般不需要返回值
	public void addEmp(List<Emp> list,Emp emp){
		list.add(emp);
	}
	
	//修改方法
	public void updateSalbyEmpno(List<Emp> list,int empno,double sal){
		for(Emp e:list){
			//引用数据类型的比较使用equals
			if(e.getEmpno().equals(empno)){
				e.setSal(sal);
			}
		}
	}
	
	
	public void deleteSalbyEmpno(List<Emp> list,int empno){
		for(int i=list.size()-1;i>=0;i--)
			//引用数据类型的比较使用equals
			if(list.get(i).getEmpno().equals(empno)){
				list.remove(i);
			}
		}
	}
	
	