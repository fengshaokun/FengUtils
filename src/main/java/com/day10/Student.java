package com.day10;
//��Ķ�����Ҫ������Ȼ˳��,�����ʵ��Comparable<����>�ӿ�
public class Student implements Comparable<Student>{
	private String name;
	private Integer java;
	private Integer c;
	private Integer php;
	private Integer count;//�ܷ�
	public Student() {
		super();
	}
	public Student(String name, Integer java, Integer c, Integer php) {
		super();
		this.name = name;
		this.java = java;
		this.c = c;
		this.php = php;
		this.count = java+c+php;
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
	public String toString() {
		return "Student [name=" + name + ", java=" + java + ", c=" + c + ", php=" + php + ", count=" + getCount() + "]";
	}
	
	//2.��ʾcompareTo����ָ���ȽϹ���;��������java�ɼ�����ǿ������
	/*@Override
	public int compareTo(Student other) {
		//return this.java-other.java;
		return this.java.compareTo(other.java);
	}*/
	
	/*public int compareTo(Student other) {
		
		return this.name.length()-other.name.length();
	}*/
	
	//�����ֽܷ�������(�Ӵ�С),�ܷ���ͬ,�������ֽ�������
	@Override
	public int compareTo(Student other) {
		if(other.count.compareTo(this.count)==0){
			return this.name.compareTo(other.name);
		}
		return other.count.compareTo(this.count);
		
		/*return count.equals(other.count)?name.compareTo(other.name)
					:other.count.compareTo(this.count);*/
	}
	
}
