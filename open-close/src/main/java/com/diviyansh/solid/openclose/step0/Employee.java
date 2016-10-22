package com.diviyansh.solid.openclose.step0;

public class Employee {
	public enum Type {
		CONTRACTOR, INTERN, SALARIED;
	}
	
	private int id;
	private Type type;
	private float hours;
	
	public Employee(int id, String type, float hours) {
		this.id = id;
		this.type = Type.valueOf(type);
		this.hours = hours;
	}

	public int getId() {
		return id;
	}

	public Type getType() {
		return type;
	}

	public float getHours() {
		return hours;
	}
}
