package java8.methodReferences;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethod {

	public static void main(String[] args) {
		ConstructorMethod method = new ConstructorMethod();
		method.References();

	}

	public void References() {
		
		Supplier<ConstructorTypes> empty = ConstructorTypes::new;
		empty.get();
		
		Function<Integer, ConstructorTypes> single = ConstructorTypes::new;
		single.apply(new Random().nextInt(100));
		
		BiFunction<Integer, Long, ConstructorTypes> dou = ConstructorTypes::new;
		dou.apply(new Random().nextInt(100), 8973735391l);
		
		ThreeParameter parameter = ConstructorTypes::new;
		parameter.parameter(new Random().nextInt(100), 9843334196l, "kodampakkam,S J Men's Hostel,Chennai");
	}

}
