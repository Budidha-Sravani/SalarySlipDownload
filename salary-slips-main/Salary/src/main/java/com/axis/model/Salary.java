package com.axis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employ-salary")
public class Salary {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private int id;
	private String employeeId;
	private String email;
	private String bankName;
	private String accountNo;
	private double basicSal;
	private double medical;
	private double houseRent;
	private double epf;
	private double tax;
	private double increment;
	private double healthInsurance;
	private double netSal;
	private int year;
	private String month;
	private double conveyance;
	private double special;
	private double grossSalary;
	private double totalDeductions;
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salary(String employeeId, String bankName, String accountNo, double basicSal, double medical,
			double houseRent, double epf, double tax, double increment, double healthInsurance, double netSal, int year,
			String month, double conveyance, double special, double grossSalary, double totalDeductions,String email) {
		super();
		this.employeeId = employeeId;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.basicSal = basicSal;
		this.medical = medical;
		this.houseRent = houseRent;
		this.epf = epf;
		this.tax = tax;
		this.increment = increment;
		this.healthInsurance = healthInsurance;
		this.netSal = netSal;
		this.year = year;
		this.month = month;
		this.conveyance = conveyance;
		this.special = special;
		this.grossSalary = grossSalary;
		this.totalDeductions = totalDeductions;
		this.email=email;
	}
	public Salary(String employeeId, String bankName, String accountNo, double basicSal, double medical,
			double houseRent, double epf, double tax, double increment, double healthInsurance, int year, String month,
			double conveyance, double special) {
		super();
		this.employeeId = employeeId;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.basicSal = basicSal;
		this.medical = medical;
		this.houseRent = houseRent;
		this.epf = epf;
		this.tax = tax;
		this.increment = increment;
		this.healthInsurance = healthInsurance;
		this.year = year;
		this.month = month;
		this.conveyance = conveyance;
		this.special = special;
		this.email=email;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	public double getHouseRent() {
		return houseRent;
	}
	public void setHouseRent(double houseRent) {
		this.houseRent = houseRent;
	}
	public double getEpf() {
		return epf;
	}
	public void setEpf(double epf) {
		this.epf = epf;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getIncrement() {
		return increment;
	}
	public void setIncrement(double increment) {
		this.increment = increment;
	}
	public double getHealthInsurance() {
		return healthInsurance;
	}
	public void setHealthInsurance(double healthInsurance) {
		this.healthInsurance = healthInsurance;
	}
	public double getNetSal() {
		double temp=grossSalary-totalDeductions;
		double temp2=(100+increment)/100;
		double t3=temp*temp2;
		 return t3;
	
	}
	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public double getConveyance() {
		return conveyance;
	}
	public void setConveyance(double conveyance) {
		this.conveyance = conveyance;
	}
	public double getSpecial() {
		return special;
	}
	public void setSpecial(double special) {
		this.special = special;
	}
	public double getGrossSalary() {
		return basicSal+houseRent+conveyance+medical+special;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTotalDeductions() {
		return epf+healthInsurance+tax;
	}
	public void setTotalDeductions(double totalDeductions) {
		this.totalDeductions = totalDeductions;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Salary(String employeeId, int year, String month) {
		super();
		this.employeeId = employeeId;
		this.year = year;
		this.month = month;
	}
	
	
	
		
}
