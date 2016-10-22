package com.diviyansh.solid.openclose.step1;

import com.diviyansh.solid.openclose.step0.Employee;

public class EmployeeService {

	public float weekelyPay(Employee employee) {
		switch (employee.getType()) {
		case INTERN: return internWeeklyPay(employee);
		case SALARIED: return salariedWeeklyPay(employee);		
		case CONTRACTOR: return contractorWeeklyPay(employee);		
		default: return 0;
		}
	}

	private float contractorWeeklyPay(Employee employee) {
		float pay = employee.getHours() * calculateHourlyPay(employee.getType());
		if (pay < 30_000) {
			return 30_000;
		} else {
			return pay;
		}
	}

	private float salariedWeeklyPay(Employee employee) {
		if (employee.getHours() < 40) {
			return employee.getHours() * calculateHourlyPay(employee.getType());
		} else {
			return 40 * calculateHourlyPay(employee.getType());
		}
	}

	private float internWeeklyPay(Employee employee) {
		return employee.getHours() * calculateHourlyPay(employee.getType());
	}

	private float calculateHourlyPay(Employee.Type type) {
		float hourlyPay = 0;

		switch (type) {
		case CONTRACTOR:
			hourlyPay = 1_200;
			break;
		case SALARIED:
			hourlyPay = 1_000;
		default:
			break;
		}

		return hourlyPay;
	}
}
