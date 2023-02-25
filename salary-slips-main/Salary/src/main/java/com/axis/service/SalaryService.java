package com.axis.service;

import java.util.List;

import com.axis.model.Salary;

public interface SalaryService {

	public Salary addSalary(Salary sal);
	public List<Salary> getAll(); 
	public Salary update(Salary sal);
	public String delete(String employeeId);
	public Salary salarySlip(Salary sal);
}
