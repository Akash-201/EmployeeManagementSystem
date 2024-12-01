package com.jspiders.employees;

public class Contract_Employee extends Employee
{

	private Integer contractPeriod;

	public Contract_Employee(Integer id, String name, long phone, String email, double sal, String designation, double exp,
			boolean isEligibleForBonus, Integer contractPeriod) {
		super(id, name, phone, email, sal, designation, exp, isEligibleForBonus);
		this.contractPeriod = contractPeriod;
	}

	public Integer getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(Integer contractPeriod) {
		this.contractPeriod = contractPeriod;
	}





}
