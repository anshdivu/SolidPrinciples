package openClose;

import java.lang.reflect.Constructor;

class EmployeeFactory {
	private enum EmployeeTypes {
		SALARIED(SalariedEmployee.class),
		INTERN(Intern.class),
		CONTRACTOR(Contractor.class);

		public Class<? extends Employee> clazz;

		private EmployeeTypes(Class<? extends Employee> clazz) {
			this.clazz = clazz;
		}
	}

	private String type;

	public EmployeeFactory(String type) {
		this.type = type;
	}

	public Employee createEmployee(int id, float hours) {
		try {
			return getConstructor(this.type).newInstance(id, hours);
		} catch (Exception ignore) {
			return this.new InvalidEmployee();
		}
	}

	private Constructor<? extends Employee> getConstructor(String type) throws NoSuchMethodException {
		Class<? extends Employee> clazz = EmployeeTypes.valueOf(type).clazz;
		return clazz.getConstructor(int.class, float.class);
	}

	private class InvalidEmployee implements Employee {
		@Override
		public float weeklyPay() {
			return 0;
		}
	}
}
