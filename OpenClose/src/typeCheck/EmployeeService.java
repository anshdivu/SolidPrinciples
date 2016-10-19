package typeCheck;

public class EmployeeService {

	public float weekelyPay(Employee employee) {
		float hourlyPay = calculateHourlyPay(employee.getType());

		switch (employee.getType()) {
		case INTERN:
			return employee.getHours() * hourlyPay;
			
		case SALARIED:
			if(employee.getHours() < 40) {
				return employee.getHours() * hourlyPay;
			} else {
				return 40 * hourlyPay;
			}
			
		case CONTRACTOR:
			float pay = employee.getHours() * hourlyPay;
			if(pay < 30_000) {
				return 30_000;
			} else {
				return pay;
			}

		default:
			return 0;
		}
	}
	
	public float calculateHourlyPay(EmployeeType type) {
		switch (type) {
		case INTERN:
			return 500;
		case SALARIED:
			return 100;
		case CONTRACTOR:
			return 1200;
		default:
			return 0;
		}
	}
}
