package openClose;

public interface Employee {
	public float weeklyPay();
	
	public static Employee create(int id, float hours, String type) {
		return new EmployeeFactory(type).createEmployee(id, hours);
	}	
}
