package com.diviyansh.solid.openclose.step3;

public class Contractor extends AbstractEmployee {
	private static final int HOURLY_PAY = 1_200;

	public Contractor(int id, float hours) {
		super(id, hours);
	}

	public float weeklyPay() {
		float pay = getHours() * HOURLY_PAY;

		if (pay < 30_000) {
			return 30_000;
		} else {
			return pay;
		}
	}

}
