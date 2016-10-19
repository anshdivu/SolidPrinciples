package typeCheck;

public class Employee {
	private int id;
	private EmployeeType type;
	private float hours;
	
	public Employee(int id, EmployeeType type, float hours) {
		this.id = id;
		this.type = type;
		this.hours = hours;
	}

	public int getId() {
		return id;
	}

	public EmployeeType getType() {
		return type;
	}

	public float getHours() {
		return hours;
	}
}
