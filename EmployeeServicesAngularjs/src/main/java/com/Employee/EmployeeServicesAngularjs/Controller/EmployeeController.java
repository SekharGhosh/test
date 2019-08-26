package com.Employee.EmployeeServicesAngularjs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.EmployeeServicesAngularjs.Model.Employee;
import com.Employee.EmployeeServicesAngularjs.Services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
@RequestMapping(value="/getAllEmployees",method=RequestMethod.GET,headers="Accept=application/Json")
public List<Employee> getAllEmployees(Model model){
	List<Employee>employeeList = employeeService.getAllEmployees();
	model.addAttribute("Employee", new Employee());
	model.addAttribute("employeeList", employeeList);
	return employeeList;
  }

@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
public String goToHomePage() {
	return "redirect:/getAllEmployees";
}

@RequestMapping(value="/getEmployee/{id}",method=RequestMethod.GET,headers="Accept=application/Json")
public void getEmployeeById(@PathVariable int Employee_ID){
	employeeService.getEmployee(Employee_ID);	
 }

@RequestMapping(value="/addEmployee",method=RequestMethod.POST,headers="Accept=application/Json")
public Employee addEmployee(@RequestBody Employee employee){
	return employeeService.addEmployee(employee);
}

@RequestMapping(value="/addEmployee",method=RequestMethod.PUT,headers="Accept=application/Json")
public Employee updateEmployee(@RequestBody Employee employee){
	return employeeService.upateEmployee(employee);
}

@RequestMapping(value="/deleteEmployee/{id}",method=RequestMethod.DELETE,headers="Accept=application/Json")
public void deleteEmployee(@PathVariable("id") int Employee_ID){
	employeeService.deleteEmployee(Employee_ID);
}
	
	

}
