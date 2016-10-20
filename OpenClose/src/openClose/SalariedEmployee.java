package openClose;

public class SalariedEmployee extends AbstractEmployee {

	private static final int HOURLY_PAY = 1_000;
	
	SalariedEmployee() {
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
