package com.diviyansh.solid.openclose.step4;

public class Salaried extends AbstractEmployee {
	private static final int HOURLY_PAY = 1_000;

	public Salaried(int id, float hours) {
		super(id, hours);
	}

	public float weeklyPay() {
		if (getHours() < 40) {
			return getHours() * HOURLY_PAY;
		} else {
			return 40 * HOURLY_PAY;
		}
	}

}
