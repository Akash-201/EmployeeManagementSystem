package com.jspiders.admin;

import com.jspiders.employees.Employee;
import com.jspiders.employees.Permanent_Employee;

public class RewardBonus 
{
   public void addBonus(Employee employee,Double bonus)
   {
	  if(employee instanceof Permanent_Employee && employee.isEligibleForBonus())
	  {
		  employee.setSal(employee.getSal()+bonus);
	  }
	  else
	  {
		  System.out.println("not eligible for bonus");
	  }
   }
}

