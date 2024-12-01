package com.jspiders.admin;

import com.jspiders.employees.Employee;

public class EmployeeAddition 
{

	public void addEmployee(Employee employee)
	{
		
//		EmployeeDB eDb =EmployeeDB.getInstance();
//		eDB.getEmpSet().add(employee);
		EmployeeDB.getInstance().getEmpSet().add(employee);
	}

}
