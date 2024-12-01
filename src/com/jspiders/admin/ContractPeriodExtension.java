package com.jspiders.admin;

import com.jspiders.employees.Contract_Employee;
import com.jspiders.employees.Employee;

public class ContractPeriodExtension 
{

  public void extendContractPeriod(Employee employee,int noOfDays) 
  {
	  if(employee instanceof Contract_Employee)
	  {
		  Contract_Employee conEmp=(Contract_Employee)employee;
		  conEmp.setContractPeriod(conEmp.getContractPeriod()+ noOfDays);
	  }
  }

}
