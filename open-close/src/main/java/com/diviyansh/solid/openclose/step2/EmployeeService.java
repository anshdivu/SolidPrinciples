package com.diviyansh.solid.openclose.step2;

import com.diviyansh.solid.openclose.step0.Employee;

public class EmployeeService {

	public float weekelyPay(Employee employee) {
		switch (employee.getType()) {
		case INTERN:
			return new Intern(employee).weeklyPay();
		case SALARIED:
			return new Salaried(employee).weeklyPay();
		case CONTRACTOR:
			return new Contractor(employee).weeklyPay();
		default:
			return 0;
		}
	}
}
