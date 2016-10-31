package com.diviyansh.solid.openclose.step4;

public interface Employee {
	int getId();
	float getHours();
	float weeklyPay();
	
	public static Employee create(String type, int id, float hours) {
		return new EmployeeFactory(type).create(id, hours);
	}
}
