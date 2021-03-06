package com.diviyansh.solid.interfacesegregation.step1;

public class Employee implements Account {
	private static final int HOURLY_PAY = 1_000;

	private int id;
	private float hours;
	
	public Employee(int id, float hours) {
		this.id = id;
		this.hours = hours;
	}

	public int getId() {
		return id;
	}

	public float getHours() {
		return hours;
	}

	public double pay() {
		if (getHours() < 40) {
			return getHours() * HOURLY_PAY;
		} else {
			return 40 * HOURLY_PAY;
		}
	}

	@Override
	public double receive() {
		throw new UnsupportedOperationException("Employee class doesn't support receive method");
	}
}
