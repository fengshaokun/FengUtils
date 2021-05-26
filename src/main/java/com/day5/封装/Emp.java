package com.day5.∑‚◊∞;

public class Emp {
	private int  empno ;//1000-9999
	private String ename;
	private int deptno ;//10 20 30 40 
	private double sal ;//>2500
	private double comm; // 0-1000
	private int sex; // 0ªÚ’ﬂ1
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		if(empno<1000||empno>9999){
			return;
		}
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		if(deptno!=10||deptno!=20||deptno!=40||deptno!=30){
			return;
		}
		this.deptno = deptno;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		
		this.sal = sal>=2500?sal:this.sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		if(comm<0||comm>1000){
			return;
		}
		this.comm = comm;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		if(sex!=0||sex!=1){
			return;
		}
		this.sex = sex;
	}
	
	

}
