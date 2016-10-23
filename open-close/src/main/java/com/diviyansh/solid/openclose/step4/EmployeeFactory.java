package com.diviyansh.solid.openclose.step4;

class EmployeeFactory {
	private enum Type {
		CONTRACTOR, INTERN, SALARIED;
	}

	private Type type;

	public EmployeeFactory(String type) {
		this.type = Type.valueOf(type);
	}

	public Employee create(int id, float hours) {
		switch (type) {
		case INTERN:
			return new Intern(id, hours);
		case SALARIED:
			return new Salaried(id, hours);
		case CONTRACTOR:
			return new Contractor(id, hours);
		default:
			return new UnknownTypeEmployee();
		}
	}

	/**
	 * This Class is used when {@link EmployeeFactory.type} doesn't match any
	 * concrete {@link Employee} class.
	 */
	private class UnknownTypeEmployee implements Employee {
		@Override
		public float weeklyPay() {
			return 0;
		}
	}
}
