package com.mudit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mudit.org.Employee;

public class EmployeeTest {

	@Test
	public void calculateSalaryTest() {
		Employee employee = new Employee(100, "XYZ");
		assertEquals(110, employee.calculateSalary(10));
	}
}