package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	// Employee Controller is dependent on the Employee Repository
	// Spring creates the instance of the dependency / (EmployeeRepository)
	// Spring injects the dependency
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		List<Employee> employeesList = null;
		employeesList = employeeRepository.findAll();
		return employeesList;
	}
}
