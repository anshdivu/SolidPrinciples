package openClose;

public class Intern extends AbstractEmployee {

	private static final int HOURLY_PAY = 500;
	
	Intern() {
	}

	@Override
	public float weeklyPay() {
		return getHours() * HOURLY_PAY;
	}

}
