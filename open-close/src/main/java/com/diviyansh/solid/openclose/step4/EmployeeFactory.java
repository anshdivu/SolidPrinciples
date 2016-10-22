package com.diviyansh.solid.openclose.step4;

import java.util.HashMap;
import java.util.Map;

class EmployeeFactory {
	private static Map<String, Class<? extends AbstractEmployee>> EMPLOYEE_TYPES = new HashMap<>();
	static {
		EMPLOYEE_TYPES.put("SALARIED", Salaried.class);
		EMPLOYEE_TYPES.put("INTERN", Intern.class);
		EMPLOYEE_TYPES.put("CONTRACTOR", Contractor.class);		
	}

	private Class<? extends AbstractEmployee> clazz;

	public EmployeeFactory(String type) {
		this.clazz = EMPLOYEE_TYPES.get(type);
	}

	public Employee create(int id, float hours) {
		try {
			return init(id, hours);
		} catch (InstantiationException | IllegalAccessException | NullPointerException ignore) {
			return this.new InvalidEmployee();
		}

	}

	public Employee init(int id, float hours) throws InstantiationException, IllegalAccessException {
		AbstractEmployee employee = clazz.newInstance();
		employee.id = id;
		employee.hours = hours;
		
		return employee;
	}

	/**
	 * This Class is used when {@link EmployeeFactory.type} doesn't match any
	 * concrete {@link Employee} class.
	 * 
	 * [Null Object Pattern]
	 */
	private class InvalidEmployee implements Employee {
		@Override
		public float weeklyPay() {
			return 0;
		}
	}
}