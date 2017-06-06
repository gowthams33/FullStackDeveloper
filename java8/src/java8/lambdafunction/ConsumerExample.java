package java8.lambdafunction;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import java8.lambda.Employee;

public class ConsumerExample {

	public ConsumerExample() {
		
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
		
		Consumer<Employee> con = (empone) -> System.out.println(empone);
		eml.forEach(con);
		
		
		Map<String, String> map = new HashMap<String,String>();
		map.put("one", "A");
		map.put("two", "B");
		map.put("three", "C");
		map.put("four", "D");
		map.put("five", "E");
		
		BiConsumer<String, String> bicon = (name, value) -> {
			System.out.println(map.get(name));
		};
		map.forEach(bicon);
	}

	public static void main(String[] args) {
		
		ConsumerExample example = new ConsumerExample();
	}

}
