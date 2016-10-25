package com.diviyansh.solid.openclose.step2;

public class EmployeeService {

	public float weeklyPay(Employee employee) {
		if (employee instanceof Intern) {
			return ((Intern) employee).weeklyPay();
		}

		if (employee instanceof Contractor) {
			return ((Contractor) employee).weeklyPay();
		}

		if (employee instanceof Salaried) {
			return ((Salaried) employee).weeklyPay();
		}

		return 0;
	}
}
