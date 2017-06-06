package java8.lambda;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingLambda {

	public SortingLambda() {
		
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
		
		System.out.println(eml);
		List<Employee> listem = eml;
		System.out.println(listem);
		/*Collections.sort(eml, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSal() > o2.getSal())
					return 1;
				if(o1.getSal() < o2.getSal())
					return -1;
				return 0;
			}
			
		});*/
		
		//Collections.sort(eml, (emp1,emp2) -> Double.compare(emp1.getSal(), emp2.getSal())) ;
		Collections.sort(eml,comparing(Employee::getSal)); 
		System.out.println(eml);
		
		// Stream APIs................................
		
		double sum = eml.stream().filter((emp) -> emp.getName().equals("google"))
								 .peek((emco) -> System.out.println(emco))
								 .mapToDouble((empm) -> empm.getSal())
								 .sum();
		System.out.println(sum);
		
		System.out.println("--------------------------------");
		List<String> li = new ArrayList<>();
		System.out.println(listem.stream().filter((emst) -> emst.getSal() > 4000).sorted(comparing(Employee::getName)).map(Employee::getName).collect(toList()));
		
		System.out.println("---------------------------------");
		List<String> list = Arrays.asList("Hello", "world");
		list.stream().flatMap((String line) -> Arrays.stream(line.split(""))).distinct().forEach(System.out::println);
		
		System.out.println("---------------------------------");
		List<Integer> listone = Arrays.asList(2,3,3,4,2,6);
		listone.stream().skip(2).forEach(System.out::println);
		//stream API's..........
	}

	public static void main(String[] args) {
		
		SortingLambda lambda = new SortingLambda();

	}

}
