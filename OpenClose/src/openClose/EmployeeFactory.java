package openClose;

class EmployeeFactory {
	private String type;

	public EmployeeFactory(String type) {
		this.type = type;
	}

	public Employee create(int id, float hours) {
		try {
			return EmployeeType.valueOf(type).create(id, hours);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException ignore) {
			return this.new InvalidEmployee();
		}
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
