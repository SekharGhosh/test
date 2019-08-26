package com.Employee.EmployeeServicesAngularjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
public class EmployeeServicesAngularjsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServicesAngularjsApplication.class, args);
		System.out.println("***********************");
	}

}
