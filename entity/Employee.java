package com.example.jforce.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "employee_id")
	private long employee_id;

	@Column(name = "name")
	private String name;

	@Column(name = "surname")
	private String surname;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phone_number;

	@Column(name = "hire_date")
	private LocalDate hire_date;

	@Column(name = "job_id")
	private int job_id;

	@Column(name = "salary")
	private int salary;

	@Column(name = "department_id")
	private int department_id;

	@Column(name = "identity_no")
	private String identity_no;

	@Column(name = "gender")
	private String gender;

	@Column(name = "current_situation")
	private String current_situation;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "account_type_id")
	private int account_type_id;


	public Employee(long employee_id, String name, String surname, String email,
					String phone_number, LocalDate hire_date, int job_id, int salary,
					int department_id, String identity_no, String gender,
					String current_situation, String username, String password,
					int account_type_id) {
		this.employee_id = employee_id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone_number = phone_number;
		this.hire_date = hire_date;
		this.job_id = job_id;
		this.salary = salary;
		this.department_id = department_id;
		this.identity_no = identity_no;
		this.gender = gender;
		this.current_situation = current_situation;
		this.username = username;
		this.password = password;
		this.account_type_id = account_type_id;
	}

	public Employee() {

	}

	public long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public LocalDate getHire_date() {
		return hire_date;
	}

	public void setHire_date(LocalDate hire_date) {
		this.hire_date = hire_date;
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getIdentity_no() {
		return identity_no;
	}

	public void setIdentity_no(String identity_no) {
		this.identity_no = identity_no;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCurrent_situation() {
		return current_situation;
	}

	public void setCurrent_situation(String current_situation) {
		this.current_situation = current_situation;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAccount_type_id() {
		return account_type_id;
	}

	public void setAccount_type_id(int account_type_id) {
		this.account_type_id = account_type_id;
	}
}
