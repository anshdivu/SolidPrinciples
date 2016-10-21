package openClose;

enum EmployeeType {
	SALARIED(SalariedEmployee.class),
	INTERN(Intern.class),
	CONTRACTOR(Contractor.class);

	private Class<? extends AbstractEmployee> clazz;

	private EmployeeType(Class<? extends AbstractEmployee> clazz) {
		this.clazz = clazz;
	}

	public Employee create(int id, float hours) throws InstantiationException, IllegalAccessException {
		AbstractEmployee employee = clazz.newInstance();
		employee.id = id;
		employee.hours = hours;

		return employee;
	}
}