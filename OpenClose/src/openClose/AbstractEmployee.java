package openClose;

public class AbstractEmployee {
	private int id;
	private float hours;

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