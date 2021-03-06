package com.entity;

import com.util.DateUtils;

import java.util.Date;

public class Emp {
	private Integer empno;//员工号 数字
	private String ename;//员工名 字符串
	private String job;//工种 字符串
	private Integer mgr;//上司工号 数字
	private Double sal;//工资 数字
	private Double comm;//奖金 数字
	private Integer deptno;//所在部门号 数字
	private Date hiredate; // 入职时间
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Integer empno, String ename, String job, Integer mgr, Double sal, Double comm, Integer deptno,
			Date hiredate) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
		this.hiredate = hiredate;
	}
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", sal=" + sal + ", comm="
				+ comm + ", deptno=" + deptno + ", hiredate=" + DateUtils.dateToString(hiredate) + "]";
	}
	
	
}
