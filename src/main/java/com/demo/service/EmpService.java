package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmpService {

	public Object insertEmp(Employee emp);
	public List<Employee> getAllEmps();
	public Object updateEmp(Employee emp);
	
	
}
