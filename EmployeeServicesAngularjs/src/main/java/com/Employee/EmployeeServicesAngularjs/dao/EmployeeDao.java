package com.Employee.EmployeeServicesAngularjs.dao;

import java.util.List;

import com.Employee.EmployeeServicesAngularjs.Model.Employee;

public interface EmployeeDao {

	public List<Employee> getAllEmployees();
	public Employee getEmployee(int Employee_ID);
	public Employee addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int Employee_ID);
}
