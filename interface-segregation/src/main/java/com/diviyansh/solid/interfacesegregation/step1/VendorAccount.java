package com.diviyansh.solid.interfacesegregation.step1;

public class VendorAccount implements Account {

	private int id;
	private double pay;
	private double receive;

	public VendorAccount(int id, double pay, double receive) {
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
