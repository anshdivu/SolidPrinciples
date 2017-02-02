package com.diviyansh.solid.interfacesegregation;

import java.time.Period;

public interface Employee extends AccountPayable {
	int getId();
	float getHours(Period dateRange);
}
