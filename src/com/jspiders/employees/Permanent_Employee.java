package com.jspiders.employees;

public class Permanent_Employee extends Employee
{

	private Integer stock;

	public Permanent_Employee(Integer id, String name, long phone, String email, double sal, String designation, double exp,
			boolean isEligibleForBonus, Integer stock) {
		super(id, name, phone, email, sal, designation, exp, isEligibleForBonus);
		this.stock = stock;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}




}
