package com.day9;
//类的对象如要具有自然顺序,则必须实现Comparable<类名>接口
public class Student implements Comparable<Student>{
private String name;
private Integer java;
private Integer c;
private Integer php;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [name=" + name + ", java=" + java + ", c=" + c + ", php=" + php + ",count=" +getCount()+"]";
}
public Student(String name, Integer java, Integer c, Integer php) {
	super();
	this.name = name;
	this.java = java;
	this.c = c;
	this.php = php;
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
public Integer getCount(){
	Integer count ;
	 count= this.java+this.c+this.php;
	 return count;
}
//2.显示compareTo方法指定比较规则;本例按照java成绩进行强制排序
	//@Override
	//public int compareTo(Student other) {

	//return this.name.compareTo(other.name);}
//优先总分进行排序(从大到小,总分相同,则按照名字进行排序)

public int compareTo(Student other) {
	if(other.getCount().compareTo(other.getCount())==0){
		return this.name.compareTo(other.name) ;
	}
	return other.getCount().compareTo(this.getCount());
	
}
}
