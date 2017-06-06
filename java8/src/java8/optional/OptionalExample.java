package java8.optional;

import java.util.Optional;

import java8.lambda.Employee;

public class OptionalExample {

	public OptionalExample() {
		
		Employee emp = new Employee();
		
		Optional<Employee> op = Optional.ofNullable(emp);
		
		Employee em = op.orElse(emp);
		System.out.println(em);
		
		Employee em1 = op.orElseGet(() -> new Employee());
		System.out.println(op.isPresent());
	}

	public static void main(String[] args) {
		OptionalExample example = new OptionalExample();

	}

}
