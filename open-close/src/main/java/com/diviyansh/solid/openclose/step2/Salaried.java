package com.diviyansh.solid.openclose.step2;

public class Salaried extends Employee {
	private static final int HOURLY_PAY = 1_000;

	public Salaried(int id, String type, float hours) {
		super(id, type, hours);
	}

	public float weeklyPay() {
		if (getHours() < 40) {
			return getHours() * HOURLY_PAY;
		} else {
			return 40 * HOURLY_PAY;
		}
	}
}
