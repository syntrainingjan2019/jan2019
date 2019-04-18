package mypkg.main;
import mypkg.*;
import mypkg.dao.EmployeeManagementImpl;
import mypkg.models.Employee;
import mypkg.service.EmployeeManagement;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeManagement ems=new EmployeeManagementImpl();
		Employee emp=new Employee();
		ems.storeEmployee(emp);
		ems.showEmployee(emp);
	}

}
