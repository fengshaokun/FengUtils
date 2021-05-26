package com.day10.work;

public class Student implements Comparable<Student> {
private Integer number;
private String name ;
private Integer java;
private Integer c;
private Integer php;
private Integer count;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Integer number, String name, Integer java, Integer c, Integer php) {
	super();
	this.number = number;
	this.name = name;
	this.java = java;
	this.c = c;
	this.php = php;
	this.count =  java+c+php;
}

@Override
public String toString() {
	return "Student [number=" + number + ", name=" + name + ", java=" + java + ", c=" + c + ", php=" + php + ", count="
			+ count + "]";
}
public Integer getNumber() {
	return number;
}
public void setNumber(Integer number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getJava() {
	return java;
}
public void setJava(Integer java) {
	this.java = java;
}
public Integer getC() {
	return c;
}
public void setC(Integer c) {
	this.c = c;
}
public Integer getPhp() {
	return php;
}
public void setPhp(Integer php) {
	this.php = php;
}
public Integer getCount() {
	count = java+c+php;
	return count;
}
@Override
public int compareTo(Student other) {

	return this.number.compareTo(other.number);
}


}
