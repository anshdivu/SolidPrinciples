package com.diviyansh.solid.interfacesegregation.step2;

public class PaymentProcessor {

	public boolean payOut(AccountPayable payable) {
		return processTransaction(payable.pay(), true);
	}

	public boolean receiveIn(AccountReceivable receivable) {
		return processTransaction(receivable.receive(), false);
	}

	private boolean processTransaction(double amount, boolean inOut) {
		return true; // need fancy implementation
	}
}
