package com.diviyansh.solid.openclose.step4;

abstract class AbstractEmployee implements Employee {
	public enum Type {
		CONTRACTOR, INTERN, SALARIED;
	}
	
	int id;
	float hours;
	
	public AbstractEmployee(int id, float hours) {
		this.id = id;
		this.hours = hours;
	}

	public int getId() {
		return id;
	}

	public float getHours() {
		return hours;
	}
}
