package cs.java8;

import java.util.function.Predicate;

import cs.dto.Employee;

public interface EmployeeValidator {

	public static Predicate<Employee> VALIDATE_NAME = (emp)-> {
		if(emp.getEname()!=null) return true;
		else throw new ValidationException("name can't be empty");
	};
	
	public static Predicate<Employee> VALIDATE_AGE = (emp)-> {
		if(emp.getAge() > 18 && emp.getAge() <=100) 	
			return true;
		else throw new ValidationException("Age is invalid");
	};
	
	public static Predicate<Employee> VALIDATE_ADDRESS = (emp) -> {
		if(emp.getAddress()!=null) return true;
		else throw new ValidationException("Address is invalid");
	};
}
