package com.axis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.model.Salary;
@Repository
public interface SalaryRepository extends JpaRepository<Salary,String>{
	public Salary findByEmployeeIdAndYearAndMonth(String employeeId,int year̥,String month);

}
