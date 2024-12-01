package com.jspiders.admin;

import java.util.Set;

import com.jspiders.employees.Employee;

public class EmployeeSearchByEmail
{

	public void search(String email)
	{
		Employee foundEmployee=null;
		Set<Employee> eSet=EmployeeDB.getInstance().getEmpSet();
		for(Employee employee : eSet)
		{
			if(employee.getEmail().equals(email)) 
			{
				foundEmployee=employee;
				System.out.println("Employee found");
				break;
			}
		}
		if(foundEmployee != null)
		{
			System.out.println(foundEmployee.getId()+"\t"+foundEmployee.getName()+"\t"+foundEmployee.getSal()
			+"\t"+foundEmployee.getExp()+"\t"+foundEmployee.getDesignation()+"\t"+
			foundEmployee.getPhone()+"\t"+foundEmployee.getPhone());
		}
		else
		{
			System.out.println("Employee not found in database");
		}
	}

}
