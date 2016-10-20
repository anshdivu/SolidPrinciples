package openClose;

public abstract class AbstractEmployee implements Employee {
	int id;
	float hours;

	AbstractEmployee() {
	}

	public int getId() {
		return id;
	}

	public float getHours() {
		return hours;
	}

}