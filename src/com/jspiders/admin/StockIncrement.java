package com.jspiders.admin;

import com.jspiders.employees.Employee;
import com.jspiders.employees.Permanent_Employee;

public class StockIncrement 
{

	public void stockIncrement(Employee employee,int noofStock)
	{
		if(employee instanceof Permanent_Employee)
		{
			Permanent_Employee perEmp= (Permanent_Employee)employee;
			perEmp.setStock(perEmp.getStock()+ noofStock);
		}
	}

}
