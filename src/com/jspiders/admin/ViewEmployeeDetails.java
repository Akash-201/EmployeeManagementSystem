package com.jspiders.admin;

import java.util.Set;

import com.jspiders.employees.Employee;

public class ViewEmployeeDetails 
{

	public void viewDetails() {
		Set<Employee> eSet = EmployeeDB.getInstance().getEmpSet();
		for (Employee employee : eSet)
		{
			System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getSal()
			+"\t"+employee.getExp()+"\t"+employee.getDesignation()+"\t"+
					employee.getPhone()+"\t"+employee.getEmail());
		}
	}

}

