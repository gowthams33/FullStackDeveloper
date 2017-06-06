package java8.methodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Laziness {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(2,3,4,5,6,7,8,9,15,345,642,63,75,72);
		List<Integer> resu = list.stream()
								 .filter(l ->{
									 System.out.println("filter method  "+l);
									 return l % 3 == 0;
								 })	
								 .map(j ->{
									 System.out.println("map method   "+j);
									 return j*j;
								 })
								 .limit(4)
								 .skip(3)
								 .collect(Collectors.toList());
	
		System.out.println(resu);
	}

}
