package openClose;

public class Contractor extends AbstractEmployee {

	private static final int MIN_WEEKLY_PAY = 20_000;
	private static final int HOURLY_PAY = 1_200;

	Contractor() {
	}

	@Override
	public float weeklyPay() {
		float pay = getHours() * HOURLY_PAY;

		if (pay < MIN_WEEKLY_PAY) {
			return MIN_WEEKLY_PAY;
		} else {
			return pay;
		}
	}
}
