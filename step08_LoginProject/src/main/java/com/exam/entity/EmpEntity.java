package com.exam.entity;

public class EmpEntity {
	/*
	 * eno number(6) primary key,   --사원번호
		ename varchar2(10)not null,  --사원이름
		phone varchar2(15),          --연락처
		dept varchar2(20));          --부서명
	*/
	private int eno;
	private String ename;
	private String phone;
	private String dept;
	public EmpEntity() {
	}
	public EmpEntity(String ename, String phone, String dept) {
		super();
		this.ename = ename;
		this.phone = phone;
		this.dept = dept;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}
