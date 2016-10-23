package com.diviyansh.solid.openclose.step0;

public class EmployeeService {

	public float weekelyPay(Employee employee) {
		switch (employee.getType()) {
		case INTERN:
			return employee.getHours() * calculateHourlyPay(employee.getType());

		case SALARIED:
			if (employee.getHours() < 40) {
				return employee.getHours() * calculateHourlyPay(employee.getType());
			} else {
				return 40 * calculateHourlyPay(employee.getType());
			}

		case CONTRACTOR:
			float pay = employee.getHours() * calculateHourlyPay(employee.getType());
			if (pay < 30_000) {
				return 30_000;
			} else {
				return pay;
			}

		default:
			return 0;
		}
	}

	public float calculateHourlyPay(Employee.Type type) {
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
