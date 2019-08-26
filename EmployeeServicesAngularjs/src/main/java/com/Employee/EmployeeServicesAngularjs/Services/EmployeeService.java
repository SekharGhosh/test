package com.Employee.EmployeeServicesAngularjs.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Employee.EmployeeServicesAngularjs.Model.Employee;
import com.Employee.EmployeeServicesAngularjs.dao.EmployeeDao;

@Service("EmployeeService")
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Transactional
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = employeeDao.getAllEmployees();
		return employeeList;
	}
	
	@Transactional
	public Employee getEmployee(int Employee_ID){
		return employeeDao.getEmployee(Employee_ID);
	}
	
	@Transactional
	public Employee addEmployee(Employee employee){
		 employeeDao.addEmployee(employee);
		 return employee;
	}
	
	@Transactional
	public Employee upateEmployee(Employee employee){
		employeeDao.updateEmployee(employee);
		return employee;
	}
	
	@Transactional
	public void deleteEmployee(int Employee_ID){
		 employeeDao.deleteEmployee(Employee_ID);
	}

}
