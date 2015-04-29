package org.bd.basis.personnameapp;

public class Student {
	private String name;
	private String regNo;
	private String email;
	public Student(String name, String regNo, String email) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.email = email;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
