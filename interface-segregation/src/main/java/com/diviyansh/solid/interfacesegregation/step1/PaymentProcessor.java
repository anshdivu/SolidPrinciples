package com.diviyansh.solid.interfacesegregation.step1;

public class PaymentProcessor {

	public boolean payOut(Account account) {
		return processTransaction(account.pay(), true);
	}

	public boolean receiveIn(Account account) {
		return processTransaction(account.receive(), false);
	}

	private boolean processTransaction(double amount, boolean inOut) {
		return true; // need fancy implementation
	}
}
