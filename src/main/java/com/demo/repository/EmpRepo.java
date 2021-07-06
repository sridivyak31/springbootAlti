package com.demo.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;*/

import com.demo.model.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer>{
	
	/*
	 * @Query("Select e.ename from Employee e") public List<Employee> getAllEmp();
	 */
}
