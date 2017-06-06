package java8.lambdafunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import java8.lambda.Employee;

public class PredicateExample {

	public PredicateExample() {
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
		
		Predicate<Employee> pre = (empone) -> empone.getName().equals("google");
		Predicate<Employee> pred = (empone) -> empone.getId() == 4;
		
		printemp(eml, pre.or(pred));
		
		printempint(eml,(i) -> i == 6); 
	}

	public void printemp(List<Employee> eml, Predicate<Employee> predicate){
		for (Employee employee : eml) {
			if(predicate.test(employee))
				System.out.println(employee);
		}
	}
	
	public void printempint(List<Employee> eml, IntPredicate predicate){
		for (Employee employee : eml) {
			if(predicate.test(employee.getId()))
				System.out.println(employee);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PredicateExample example = new PredicateExample();
	}

}
