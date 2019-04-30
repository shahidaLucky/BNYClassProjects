package com.jpaSampleProject.main;

import com.jpaSampleProject.entities.Employee;
import com.jpaSampleProject.services.EmployeeService;

public class MainRunner {

	public static void main(String[] args) {
	
		System.out.println("Hello World");
		
		Employee employee = new Employee();
		
		employee.setEMPLOYEEID(105);
		employee.setFIRST_NAME("Lucy");
		employee.setLAST_NAME("David");
		employee.setPHONE("123456789");
		
		EmployeeService.createEmployee(employee);
		//EmployeeService.updateEmployeePhone(101, "4567880990");
		
		//testing find an employee
		
//		Employee vFoundEmployee = new Employee();
//		vFoundEmployee.setEMPLOYEEID(101);
		
		//vFoundEmployee = EmployeeService.findEmployee(vFoundEmployee.getEMPLOYEEID(10));
		
		//EmployeeService.removeEmployee(employee);
		
		//Remove Employee
//		Employee vEmployee = new Employee();
//		vEmployee.setEMPLOYEEID(40);
//		vEmployee = EmployeeService.removeEmployee(vEmployee.getEMPLOYEEID());
//		if(vEmployee != null) {
//			System.out.println("*********** Employee Deleted**********");
//			System.out.println(vEmployee.toString());
//		}else {
//		System.out.println("Error = Employee to be deleted not found");
//		}

	}

}
