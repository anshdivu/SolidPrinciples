package openClose;

public class Intern extends AbstractEmployee implements Employee {

	private static final int HOURLY_PAY = 500;
	
	public Intern(int id, float hours) {
		super(id, hours);
	}

	@Override
	public float weeklyPay() {
		return getHours() * HOURLY_PAY;
	}

}
