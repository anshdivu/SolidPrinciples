package com.diviyansh.solid.interfacesegregation.step2;

public class Account implements AccountPayable, AccountReceivable {
	private int id;
	private double receive;
	private double pay;

	public Account(int id, double receive, double pay) {
		this.id = id;
		this.pay = pay;
		this.receive = receive;
	}

	int getId() {
		return id;
	}

	@Override
	public double receive() {
		return receive;
	}

	@Override
	public double pay() {
		return pay;
	}
}
