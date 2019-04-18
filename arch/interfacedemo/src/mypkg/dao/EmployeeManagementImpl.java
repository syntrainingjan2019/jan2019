package mypkg.dao;
import mypkg.models.Employee;
import mypkg.service.*;
public class EmployeeManagementImpl implements EmployeeManagement{

	@Override
	public void storeEmployee(Employee emp) {
		// TODO Auto-generated method stub
		emp.setEmpid(101);
		emp.setAddress("addres01");
		emp.setName("Employee Name01");
	}

	@Override
	public void showEmployee(Employee emp) {
		// TODO Auto-generated method stub
	System.out.println(emp);
	}

}
