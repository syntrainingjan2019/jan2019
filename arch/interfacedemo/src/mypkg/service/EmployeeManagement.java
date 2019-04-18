package mypkg.service;

import mypkg.models.Employee;

public interface EmployeeManagement {
	public void storeEmployee(Employee emp);
	public void showEmployee(Employee emp);
}
