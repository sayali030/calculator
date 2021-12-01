package com.java.employee.app;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String empName;
	private String empAddress;
	private String empEmail;
	private int empAge;
	private LocalDate empBirthDay;
	private LocalDate empDateOfJoing;
	private double empSalary;
	private long mobileNumber;
	private String empRole;
	
	
	public Employee() {
		//this(101,"AAA","Pune","abc@gmail.com",23,LocalDate.now(),LocalDate.now(),83384.45,128792);
	}
	
	
	
	public String getEmpRole() {
		return empRole;
	}



	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}



	public Employee(int empId, String empName, String empAddress, String empEmail, int empAge, LocalDate empBirthDay,
			LocalDate empDateOfJoing, double empSalary, long mobileNumber, String empRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empEmail = empEmail;
		this.empAge = empAge;
		this.empBirthDay = empBirthDay;
		this.empDateOfJoing = empDateOfJoing;
		this.empSalary = empSalary;
		this.mobileNumber = mobileNumber;
		this.empRole = empRole;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empEmail="
				+ empEmail + ", empAge=" + empAge + ", empBirthDay=" + empBirthDay + ", empDateOfJoing="
				+ empDateOfJoing + ", empSalary=" + empSalary + ", mobileNumber=" + mobileNumber + ", empRole="
				+ empRole + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public LocalDate getEmpBirthDay() {
		return empBirthDay;
	}
	public void setEmpBirthDay(LocalDate empBirthDay) {
		this.empBirthDay = empBirthDay;
	}
	public LocalDate getEmpDateOfJoing() {
		return empDateOfJoing;
	}
	public void setEmpDateOfJoing(LocalDate empDateOfJoing) {
		this.empDateOfJoing = empDateOfJoing;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}		
	
	
	
	
}
