package com.diviyansh.solid.openclose.step4;

public interface Employee {
	float weeklyPay();
	
	public static Employee create(String type, int id, float hours) {
		return new EmployeeFactory(type).create(id, hours);
	}
}
