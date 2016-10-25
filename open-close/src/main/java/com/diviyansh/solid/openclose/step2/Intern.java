package com.diviyansh.solid.openclose.step2;

public class Intern extends Employee {
	private static final int HOURLY_PAY = 500;

	public Intern(int id, String type, float hours) {
		super(id, type, hours);
	}

	public float weeklyPay() {
		return getHours() * HOURLY_PAY;
	}
}
