package com.diviyansh.solid.openclose.step2;

import com.diviyansh.solid.openclose.step0.Employee;

public class Contractor {

	private static final int HOURLY_PAY = 1_200;
	private Employee employee;

	public Contractor(Employee employee) {
		this.employee = employee;
	}


	public float weeklyPay() {
		float pay = employee.getHours() * HOURLY_PAY;

		if (pay < 30_000) {
			return 30_000;
		} else {
			return pay;
		}
	}

}
