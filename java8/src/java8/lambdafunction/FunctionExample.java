package java8.lambdafunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import java8.lambda.Employee;

public class FunctionExample {

	public FunctionExample() {
		
		List<Employee> eml = new ArrayList<Employee>();
		Employee em = new Employee(1, 3421.43, "google");
		Employee em1 = new Employee(2, 4145.34, "ebay");
		Employee em2 = new Employee(3, 5636.64, "paypal");
		Employee em3 = new Employee(4, 97574.879, "krossark");
		Employee em4 = new Employee(5, 65239.33, "google");
		Employee em5 = new Employee(6, 84731.68, "ivtl");
		
		eml.add(em);
		eml.add(em1);
		eml.add(em2);
		eml.add(em3);
		eml.add(em4);
		eml.add(em5);
		
		Function<Employee, String>  fun = (empone) -> {
			empone.setName("Gowtham"+empone.getName().toUpperCase());
			return ""+empone;
		};
		
		System.out.println(fun.apply(em));
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		FunctionExample example = new FunctionExample();
	}

}
