package openClose;

public class SalariedEmployee extends AbstractEmployee implements Employee {

	private static final int HOURLY_PAY = 1_000;
	
	public SalariedEmployee(int id, float hours) {
		super(id, hours);
	}

	@Override
	public float weeklyPay() {
		if(getHours() > 40) {
			return 40 * HOURLY_PAY;
		} else {
			return getHours() * HOURLY_PAY;
		}
	}

}
