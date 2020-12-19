package com.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.entity.EmployeeEntity;
import com.spring.json.Employee;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long>{
	public List<EmployeeEntity> findAllEmployeeByNameAndSal(String name, double sal);
	public List<EmployeeEntity> findBySalGreaterThan(double sal);
	public List<EmployeeEntity> findByOrderByNameAsc();
	
	@Query("select upper(e.name) from EmployeeEntity e")
	public List<String> findAllEmployee();
	
	public List<EmployeeEntity> findByNameStartsWith(char a);
	
}
