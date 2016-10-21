package openClose;

public abstract class AbstractEmployee implements Employee {
	// package Level members are only accessed by EmployeeFactory
	int id;
	float hours;

	AbstractEmployee() {
	}

	public AbstractEmployee(int id, float hours) {
		this.id = id;
		this.hours = hours;
	}

	public int getId() {
		return id;
	}

	public float getHours() {
		return hours;
	}

}