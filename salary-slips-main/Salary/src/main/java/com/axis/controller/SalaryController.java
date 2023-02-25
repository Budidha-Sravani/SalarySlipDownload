package com.axis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.model.Salary;
import com.axis.service.SalaryService;

@RestController
@RequestMapping("/api/v1")
public class SalaryController {
	@Autowired
	SalaryService salaryService;
	
	@PostMapping("/add")
	public ResponseEntity<Salary> getSal(@RequestBody Salary sal){
		return new ResponseEntity<Salary>(salaryService.addSalary(sal),HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Salary>> getAll(){
		return new ResponseEntity<List<Salary>>(salaryService.getAll(),HttpStatus.OK);
	}
	@PutMapping("/edit")
	public ResponseEntity<Salary> edit(@RequestBody Salary sal)
	{
		return new ResponseEntity<Salary>(salaryService.update(sal),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{employeeId}")
	public ResponseEntity<String> delete(@PathVariable String employeeId){
		return new ResponseEntity<String>(salaryService.delete(employeeId),HttpStatus.OK);
	}
	@PostMapping("/salary")
	public ResponseEntity<Salary> salrySlip(@RequestBody Salary sal){
		return new ResponseEntity<Salary>(salaryService.salarySlip(sal),HttpStatus.OK);
	}
	
}
