package com.Employee.EmployeeServicesAngularjs.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



/*
 * This is our Entity class and it corresponds to Employee table in database
 */

@Entity
@Table(name="EMPLOYEE")
public class Employee {
	
	@Id
	@Column(name="Employee_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="EMPLOYEE_NAME")
	String employeeName;
	
	@Column(name="EMAIL")
	String email;
	
	public Employee(){
		super();
	}
	
	public Employee(String employeeName,String email){
		super();
		this.employeeName=employeeName;
		this.email=email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
