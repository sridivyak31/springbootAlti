package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService service;

	@PostMapping("/createEmp")
	public Object addEmp(@RequestBody Employee emp) {
		Map<String,String> map = new HashMap<>();
			
		if(emp.getEname().isEmpty()) {
			map.put("status","error");
			map.put("msg","Please enter valid details");
			}
			else
			{
				map.put("200", "value");
				map.put("msg","success");
				service.insertEmp(emp);
			}
		
		return map;
	}
	
		@GetMapping("/getEmp")
		public List<Employee> getEmp(){
		return service.getAllEmps();
		}
	
	@PostMapping("/updateEmp")
	public Object updateEmployee(@RequestBody Employee emp) {
		Map<String,String> map = new HashMap<>();
			
		if(emp.getEname().isEmpty()) {
			map.put("status","error");
			map.put("msg","Please enter valid details");
			}
			else
			{
				map.put("200", "value");
				map.put("msg","success");
				service.updateEmp(emp);
			}
		
		return map;
		
		
	}
}
