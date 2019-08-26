package com.Employee.EmployeeServicesAngularjs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Employee.EmployeeServicesAngularjs.Model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> employeeList = session.createQuery("from Employee").list();
		return employeeList;
	}

	@Override
	public Employee getEmployee(int Employee_ID) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = session.get(Employee.class, Employee_ID);
		return employee;
	}

	@Override
	public Employee addEmployee(Employee employee) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(employee);
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) {
        Session session= this.sessionFactory.getCurrentSession();
        session.update(employee);
		
	}

	@Override
	public void deleteEmployee(int Employee_ID) {
        Session session= this.sessionFactory.getCurrentSession();
        Employee employee = (Employee)session.load(Employee.class, Employee_ID);
        if(null!=employee){
        	session.delete(employee);
        }
		
	}

}
