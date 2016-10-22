package com.diviyansh.solid.openclose.step4;

public class Intern extends AbstractEmployee {
	private static final int HOURLY_PAY = 500;

	public Intern(int id, float hours) {
		super(id, hours);
	}

	public float weeklyPay() {
		return getHours() * HOURLY_PAY;
	}

}
