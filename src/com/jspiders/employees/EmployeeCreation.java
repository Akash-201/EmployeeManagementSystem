package com.jspiders.employees;

public class EmployeeCreation 
{

private static int initNum=10001;

public Employee createEmployee(String name, long phone, String email, double sal,
		String designation, double exp,char empType)
{
	Employee emp=null;
	if(empType=='p')
	{
		emp=new Permanent_Employee(initNum++,name,phone,email,sal,designation,exp,true,100) ;
		
	}
	else if(empType=='c')
	{
		emp=new Contract_Employee(initNum++,name,phone,email,sal,designation,exp,false,120);
	}
	return emp;

}
}  
