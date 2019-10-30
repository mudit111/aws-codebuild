package com.mudit.org;

public class Employee {

	private int employeeSalary;
	private String employeeName;

	public Employee(int employeeSalary, String employeeName) {
		this.employeeSalary = employeeSalary;
		this.employeeName = employeeName;
	}

	public int calculateSalary(int percentageIncrease) {
		return (employeeSalary * (100 + percentageIncrease))/100;
	}
}
