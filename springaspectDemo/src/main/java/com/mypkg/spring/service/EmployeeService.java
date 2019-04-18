package com.mypkg.spring.service;

import com.mypkg.spring.model.Employee;

public class EmployeeService {
	Employee employee;
	public Employee getEmployee(){
		return employee;
	}
	public void setEmployee(Employee employee){
		this.employee=employee;
	}
}
