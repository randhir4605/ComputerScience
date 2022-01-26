package cs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import cs.dto.Address;
import cs.dto.Employee;

public class EmployeeValidatorMain {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		Employee emp=new Employee();
		emp.setEname("Randhir");
		Address address=new Address();
		address.setLine1("Flat no -12");
		address.setLine2("Near Santosh Gym");
		address.setPincode(123456);
		emp.setAddress(address);
		emp.setAge(21);
		empList.add(emp);
		
		emp=new Employee();
		emp.setEname("Randhir");
		address=new Address();
		address.setLine1("Flat no -42");
		address.setLine2("Near City Hall");
		address.setPincode(987654);
		emp.setAddress(address);
		emp.setAge(66);
		empList.add(emp);
		
		Predicate<Employee> validationPredicate=EmployeeValidator.VALIDATE_NAME.and(EmployeeValidator.VALIDATE_ADDRESS).and(EmployeeValidator.VALIDATE_AGE);
		boolean validated=empList.stream().allMatch(validationPredicate);
		
		
	}
}
