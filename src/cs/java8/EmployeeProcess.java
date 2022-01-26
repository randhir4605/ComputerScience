package cs.java8;

import java.util.function.Function;

import cs.dto.Employee;

public class EmployeeProcess {

	public static Function<Employee,Employee> PRCOESS_EMPLOYEE =(emp)-> {
		if(emp.getAge()>=18 && emp.getAge()<60) {
			emp.setAgeGroup("Adult");
		}else {
			emp.setAgeGroup("Senior Citizen");
		}
		return emp;
	};
}
