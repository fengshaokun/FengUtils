package com.day13;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private Integer userid;// �û����
	private String username;// �û���
	private String psd;// ����
	private String job = "ѧ��";// ����
	private Integer classid = 1;
	// �༶��
	/*
	 * private String course="java";//�γ� private Integer source=60;//�ɼ�
	 */ private Integer falseCount = 0;// �������
	private Date lastFalseTime;// ���һ�γ���ʱ��

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer userid, String username, String psd, String job, Integer classid) {
		super();
		this.userid = userid;
		this.username = username;
		this.psd = psd;
		this.job = job;
		this.classid = classid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPsd() {
		return psd;
	}

	public void setPsd(String psd) {
		this.psd = psd;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getClassid() {
		return classid;
	}

	public void setClassid(Integer classid) {
		this.classid = classid;
	}

	/*
	 * public String getCourse() { return course; }
	 * 
	 * 
	 * public void setCourse(String course) { this.course = course; }
	 * 
	 * 
	 * public Integer getSource() { return source; }
	 * 
	 * 
	 * public void setSource(Integer source) { this.source = source; }
	 */

	public Integer getFalseCount() {
		return falseCount;
	}

	public void setFalseCount(Integer falseCount) {
		this.falseCount = falseCount;
	}

	public Date getLastFalseTime() {
		return lastFalseTime;
	}

	public void setLastFalseTime(Date lastFalseTime) {
		this.lastFalseTime = lastFalseTime;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", psd=" + psd + ", job=" + job + ", classid="
				+ classid + ", falseCount=" + falseCount + ", lastFalseTime=" + lastFalseTime + "]";
	}

}