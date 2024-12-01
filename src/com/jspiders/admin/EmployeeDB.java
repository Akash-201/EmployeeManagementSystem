package com.jspiders.admin;

import java.util.HashSet;
import java.util.Set;

import com.jspiders.employees.Employee;

public class EmployeeDB 
{
    private static EmployeeDB empDBRef;
	private Set<Employee> empSet=new HashSet<Employee>();
	//used to store records of Employee in set format
	
	private EmployeeDB()
	{
		
	}
	public Set<Employee> getEmpSet()
	{
		return this.empSet;
	}
	static public  EmployeeDB getInstance()
	{
		if(empDBRef == null)
		{
			empDBRef = new EmployeeDB();
		}
		return empDBRef;
	}

}
