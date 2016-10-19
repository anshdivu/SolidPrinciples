package openClose;

import java.lang.reflect.Constructor;

public class EmployeeDbMapper {
	public static Employee create(int id, float hours, int type) {
		try {
			Constructor<? extends Employee> constructor = EmployeeType.SALARIED.getConstructor();
			return constructor.newInstance(id, hours);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	private enum EmployeeType {
		SALARIED(0, SalariedEmployee.class),
		INTERN(1, Intern.class), 
		CONTRACTOR(2, Contractor.class);
		
		private int type;
		private Class<? extends Employee> clazz;

		EmployeeType(int type, Class<? extends Employee> clazz) {
			this.type = type;
			this.clazz = clazz;
		}

		public Constructor<? extends Employee> getConstructor() throws NoSuchMethodException, SecurityException {
			return clazz.getConstructor(int.class, float.class);
		}
	}	
}
