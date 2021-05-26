package com.day9;

import com.util.DateUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Zuoye {
	private Integer empno;//Ա���� 
	private String name;//Ա����
	private String job;//����
	private Integer mgr;//��˾���
	private Date hiredate;//��ְ
	private Double sal;//����
	private Double comm;//����
	private Integer deptno;//���ڲ��ź�
	
	public Zuoye() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Zuoye(Integer empno, String name, String job, Integer mgr, Date hiredate, Double sal, Double comm,
			Integer deptno) {
		super();
		this.empno = empno;
		this.name = name;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Zuoye [empno=" + empno + ", name=" + name + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	
	//��ѯ����ʾ���ʸ���ĳ��ֵ��Ա��
	public static void compareSal(List<Zuoye> list, Double sal){
		for(Zuoye a:list){
			if(a.getSal()>sal){
           	System.out.println(a);
			}
	}	
	}
	//���ݹ����޸Ĺ���
	public static void setSal(List<Zuoye> list, Integer empno, Double sal){
		for(Zuoye a:list){
			if(a.getEmpno().equals(empno)){
				a.setSal(sal);
			}
		}
		
	}
	//ɾ��ָ��Empno��Ա��
	public static void delDmpno(List<Zuoye> list, Integer empno){
		for(int i=list.size()-1;i>=0;i--){
			if(list.get(i).getEmpno().equals(empno)){
				list.remove(i);
				return ;
			}else {System.out.println("û�д���");
		
			}
			}		
	}
			//���һ���µļ�¼
	public static void addEmp(List<Zuoye> list, String...ss){
		for (String msg:ss){
			String[]sa=msg.split("[#]");
			System.out.println(Arrays.toString(sa));
			Integer empno = Integer.valueOf(sa[0]);
			 String name=sa[1];
			 
			 String job=sa[2];
		Integer mgr; 
		if(!sa[3].equals("")){
			 mgr=Integer.valueOf(sa[3]);
		 }else{
			 mgr=null;
		 }
			 Date hiredate=DateUtils.stringToDateUpdate(sa[4]);
			 Double sal=Double.valueOf(sa[5]);
			 Double comm;
			 if(!sa[6].equals("")){
				 comm=Double.valueOf(sa[6]);
			 }else{
				 comm=null;
			 }
			Integer deptno=Integer.valueOf(sa[7]);
			Zuoye s = new Zuoye(empno,name,job,mgr,hiredate,sal,comm,deptno);
			list.add(s);
			}
			
	}
	}
	
	
	