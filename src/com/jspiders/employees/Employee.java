package com.jspiders.employees;

public class Employee 
{
	private final Integer id;
	private String name;
	private long phone;
	private  String email;
	private  double sal;
	private String designation;
	private double exp;
	private boolean isEligibleForBonus;
	public Employee(Integer id, String name, long phone, String email, double sal, String designation, double exp,
			boolean isEligibleForBonus) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.sal = sal;
		this.designation = designation;
		this.exp = exp;
		this.isEligibleForBonus = isEligibleForBonus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public boolean isEligibleForBonus() {
		return isEligibleForBonus;
	}
	public void setEligibleForBonus(boolean isEligibleForBonus) {
		this.isEligibleForBonus = isEligibleForBonus;
	}
	public Integer getId() {
		return id;
	}
	public int hashcode()
	{
		return this.id;
	}
	public boolean equals(Object arg)
	{
		return this.hashcode() == arg.hashCode();
	}



}
