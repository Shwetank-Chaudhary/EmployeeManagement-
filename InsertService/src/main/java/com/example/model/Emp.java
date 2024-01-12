package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Emp {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "username")
	private String username;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "phonenumber")
	private String phonenumber;

	@Column(name = "DOB")
	private String DOB;

	@Column(name = "position")
	private String position;

	@Column(name = "department")
	private String department;

	@Column(name = "hire_date")
	private String hire_date;

	@Column(name = "salary")
	private float salary;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDob() {
		return DOB;
	}

	public void setDob(String DOB) {
		this.DOB = DOB;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Emp(int id, String username, String first_name, String last_name,String phonenumber,String DOB,String position,
			String department, String hire_date, float salary, String password, String role) {
		this.id = id;
		this.username = username;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phonenumber = phonenumber;
		this.DOB = DOB;
		this.position = position;
		this.department = department;
		this.hire_date = hire_date;
		this.salary = salary;
		this.password = password;
		this.role = role;
	}

	public Emp() {
	}

}
