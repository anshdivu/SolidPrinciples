package openClose;

public class EmployeeDbMapper {
	public static Employee create(int id, float hours, String type) {
	    EmployeeType employeeType = EmployeeType.valueOf(type);
	    return employeeType.getEmployee(id, hours);
	}
	
	private enum EmployeeType {
		SALARIED(SalariedEmployee.class),
		INTERN(Intern.class), 
		CONTRACTOR(Contractor.class);
		
		private Class<? extends AbstractEmployee> clazz;

		EmployeeType(Class<? extends AbstractEmployee> clazz) {
			this.clazz = clazz;
		}

		public Employee getEmployee(int id, float hours) {
		    try {
			AbstractEmployee employee = clazz.newInstance();
			employee.id = id;
			employee.hours = hours;
			return employee;
		    } catch (IllegalAccessException|InstantiationException e) {
			e.printStackTrace();
			return null;
		    }
		}
	}	
}
