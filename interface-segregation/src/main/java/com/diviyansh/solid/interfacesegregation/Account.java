package com.diviyansh.solid.interfacesegregation;

public interface Account extends AccountPayable, AccountReceivable {
	int getId();
}
