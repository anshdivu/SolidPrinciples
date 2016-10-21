package typeCheck;

public class EmployeeService {

	public float weekelyPay(Employee employee) {
		float hourlyPay = calculateHourlyPay(employee.getType());

		switch (employee.getType()) {
		case INTERN:
			return employee.getHours() * hourlyPay;

		case SALARIED:
			if (employee.getHours() < 40) {
				return employee.getHours() * hourlyPay;
			} else {
				return 40 * hourlyPay;
			}

		case CONTRACTOR:
			float pay = employee.getHours() * hourlyPay;
			if (pay < 30_000) {
				return 30_000;
			} else {
				return pay;
			}

		default:
			return 0;
		}
	}

	public float calculateHourlyPay(EmployeeType type) {
		float hourlyPay = 0;

		if (type == EmployeeType.CONTRACTOR) {
			hourlyPay = 1_200;
		} else if (type == EmployeeType.SALARIED) {
			hourlyPay = 1_000;
		}

		return hourlyPay;
	}
}
