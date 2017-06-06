package java8.lambdafunction;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import java8.lambda.Employee;

public class UnaryExample {

	public UnaryExample() {
		Employee emp1 = new Employee();
		UnaryOperator<Employee> unop = (emp) -> {
			emp.setName("paypal");
			
			return emp;
		};
		
		System.out.println(unop.apply(new Employee()));
		emp1.setSal(210);
		BinaryOperator<Double> biop = (empone,emptwo) -> empone + emptwo;
		System.out.println(biop.apply(emp1.getSal(), emp1.getSal()));
		
	}

	public static void main(String[] args) {
		
		UnaryExample example = new UnaryExample();

	}

}
