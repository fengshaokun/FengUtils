package com.day9;

import com.day8.hw.Emp;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	//��ѯҪ���ر�������
	//��ָ����list�в�ѯ����targetSal�Ľ��
	public  List<Emp> queryEmpsBySal(List<Emp> list,double targetSal){
		List<Emp> emps = new ArrayList<>();//��ѯ�Ľ������˼���
		for(Emp e:list){
			if(e.getSal()>=targetSal){
				emps.add(e);
			}
		}
		return emps;
	}
	
	//��ɾ�ķ���һ�㲻��Ҫ����ֵ
	public void addEmp(List<Emp> list,Emp emp){
		list.add(emp);
	}
	
	//�޸ķ���
	public void updateSalbyEmpno(List<Emp> list,int empno,double sal){
		for(Emp e:list){
			//�����������͵ıȽ�ʹ��equals
			if(e.getEmpno().equals(empno)){
				e.setSal(sal);
			}
		}
	}
	
	
	public void deleteSalbyEmpno(List<Emp> list,int empno){
		for(int i=list.size()-1;i>=0;i--)
			//�����������͵ıȽ�ʹ��equals
			if(list.get(i).getEmpno().equals(empno)){
				list.remove(i);
			}
		}
	}
	
	