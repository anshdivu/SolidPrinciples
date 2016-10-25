package com.diviyansh.solid.openclose.step2;

public class Contractor extends Employee {
	private static final int HOURLY_PAY = 1_200;

	public Contractor(int id, String type, float hours) {
		super(id, type, hours);
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
