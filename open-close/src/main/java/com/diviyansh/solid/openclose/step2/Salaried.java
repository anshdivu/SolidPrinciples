package com.diviyansh.solid.openclose.step2;

import com.diviyansh.solid.openclose.step0.Employee;

public class Salaried {

	private static final int HOURLY_PAY = 1_000;
	private Employee employee;

	public Salaried(Employee employee) {
		this.employee = employee;
	}

	public float weeklyPay() {
		if (employee.getHours() < 40) {
			return employee.getHours() * HOURLY_PAY;
		} else {
			return 40 * HOURLY_PAY;
		}
	}

}
