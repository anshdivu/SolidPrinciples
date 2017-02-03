package com.diviyansh.solid.interfacesegregation.step0;

public class Account {

	private int id;
	private double pay;
	private double receive;

	public Account(int id, double pay, double receive) {
		this.id = id;
		this.pay = pay;
		this.receive = receive;
	}

	public int getId() {
		return id;
	}

	public double pay() {
		return pay;
	}

	public double receive() {
		return receive;
	}
}
