package com.exam.entity;
//변수4개(db와 일치하도록 만들기), 생성자, getter setter
public class LoginEntity {
	private String id;
	private String pwd;
	private String name;
	private double point;

	public LoginEntity() {
	}
	public LoginEntity(String id, String pwd, String name, double point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
}
