package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.Salary;
import com.axis.repository.SalaryRepository;
@Service
public class SalaryServiceImpl implements SalaryService{

	@Autowired 
	SalaryRepository salaryRepository;

	@Override
	public Salary addSalary(Salary sal) {
		// TODO Auto-generated method stub
		
		return salaryRepository.save(sal);
	}

	@Override
	public List<Salary> getAll() {
		// TODO Auto-generated method stub
		return salaryRepository.findAll();
	}

	@Override
	public Salary update(Salary sal) {
		// TODO Auto-generated method stub
		Salary salary=salaryRepository.findById(sal.getEmployeeId()).orElseThrow();
		salary.setBankName(sal.getBankName());
		salary.setAccountNo(sal.getAccountNo());
		salary.setBasicSal(sal.getBasicSal());
		salary.setConveyance(sal.getConveyance());
		salary.setEmail(sal.getEmail());
		salary.setEpf(sal.getEpf());
		
		salary.setHealthInsurance(sal.getHealthInsurance());
		salary.setHouseRent(sal.getHouseRent());
		salary.setIncrement(sal.getIncrement());
		salary.setMedical(sal.getMedical());
		salary.setMonth(sal.getMonth());
		salary.setSpecial(sal.getSpecial());
		salary.setTax(sal.getTax());
		salary.setYear(sal.getYear());
		
		return salaryRepository.save(salary);
	}

	@Override
	public String delete(String employeeId) {
		// TODO Auto-generated method stub
		Salary salary=salaryRepository.findById(employeeId).orElseThrow();
		if(salary!=null) {
			 salaryRepository.delete(salary);
			 return "deleted successfully";
		}
		else {
			return "Data not found";
		}
	}

	@Override
	public Salary salarySlip(Salary sal) {
		// TODO Auto-generated method stub
		
		return salaryRepository.findByEmployeeIdAndYearAndMonth(sal.getEmployeeId(), sal.getYear(), sal.getMonth());
	}
	

}
