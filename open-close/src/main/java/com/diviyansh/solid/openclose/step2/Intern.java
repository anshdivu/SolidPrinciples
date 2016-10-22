package com.diviyansh.solid.openclose.step2;

import com.diviyansh.solid.openclose.step0.Employee;

public class Intern {

	private static final int HOURLY_PAY = 500;
	private Employee employee;

	public Intern(Employee employee) {
		this.employee = employee;
	}

	public float weeklyPay() {
		return employee.getHours() * HOURLY_PAY;
	}

}
