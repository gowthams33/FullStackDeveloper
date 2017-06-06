package jaava8.Methods;

@FunctionalInterface
public interface SampleInterfaceTwo {
	
	float count = 0.0f;
	public double size(float count);
	
	public default int getCount(){
		System.out.println("Sample two count method");
		return 15;
	}
	
	public static void display(){
		System.out.println("Count values "+count);
	}

}
