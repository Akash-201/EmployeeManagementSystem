package com.jspiders.main;

import com.jspiders.admin.EmployeeAddition;
import com.jspiders.admin.EmployeeSearchByEmail;
import com.jspiders.admin.EmployeeSearchById;
import com.jspiders.admin.SetUpApp;
import com.jspiders.admin.ViewEmployeeDetails;
import com.jspiders.employees.Employee;
import com.jspiders.employees.EmployeeCreation;

public class RunEMSApp
{
public static void main(String[] args) 
{
	System.out.println("-------------------------------");
	System.out.println("Welcome to EMS App");
	System.out.println("-------------------------------");
	
	Employee e1=new EmployeeCreation().createEmployee(
			"ramesh",
			9988776655L,
			"ramesh@gmail.com",
			25000.00,
			"Trainee",
			0.5,
			'p');
	
	Employee e2=new EmployeeCreation().createEmployee(
			"Suresh", 
			9876436745L,
			"suresh@gmail.com",
			35000.00,
			"Trainee",
			1.5,
			'p');
	
//	new EmployeeAddition().addEmployee(e1);
//	new EmployeeAddition().addEmployee(e2);
//	new ViewEmployeeDetails().viewDetails();
//	new EmployeeSearchById().search(10002);
//	new EmployeeSearchByEmail().search("ramesh@gmail.com");
	
	SetUpApp.eA.addEmployee(e1);
	SetUpApp.eA.addEmployee(e2);
	SetUpApp.vED.viewDetails();
	SetUpApp.searchById.search(10002);
}
}
