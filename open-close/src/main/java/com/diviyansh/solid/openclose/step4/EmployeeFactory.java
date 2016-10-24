package com.diviyansh.solid.openclose.step4;

class EmployeeFactory {
	private String type;

	public EmployeeFactory(String type) {
		this.type = type;
	}

	public Employee create(int id, float hours) {
		switch (type) {
		case "INTERN":
			return new Intern(id, hours);
		case "SALARIED":
			return new Salaried(id, hours);
		case "CONTRACTOR":
			return new Contractor(id, hours);
		default:
			return new UnknownTypeEmployee(type, id, hours);
		}
	}

	/**
	 * This Class is used when {@link EmployeeFactory.type} doesn't match any
	 * concrete {@link Employee} class.
	 */
	public class UnknownTypeEmployee extends AbstractEmployee {
		private String type;

		public UnknownTypeEmployee(String type, int id, float hours) {
			super(id, hours);
			this.type = type;
		}

		@Override
		public float weeklyPay() {
			return 0;
		}

		/**
		 * Debug Only Data
		 */
		public String getType() {
			return type;
		}
	}
}
