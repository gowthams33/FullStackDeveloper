package java8.lambdafunction;

import java.util.function.Supplier;

import java8.lambda.Employee;

public class SupplierExample {

	public SupplierExample() {
	
		Supplier<Employee> sup = () -> new Employee();
		System.out.println(sup.get());
	}

	public static void main(String[] args) {
		SupplierExample  example = new SupplierExample();

	}

}
