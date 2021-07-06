package com.demo.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRepo repo;
	
	@Override
	public Object insertEmp(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public List<Employee> getAllEmps() {
		
		return repo.findAll();
	}

	@Override
	public Object updateEmp(Employee emp) {
		
		return repo.saveAndFlush(emp);
	}

	

	
}
