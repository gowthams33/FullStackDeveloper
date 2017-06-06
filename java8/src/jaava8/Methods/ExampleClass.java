package jaava8.Methods;

public class ExampleClass implements SampleInterface{

	float count;
	public ExampleClass() {
		SampleInterfaceTwo.display();
	}
	
	public static void main(String[] args) {
		
		ExampleClass class1 = new ExampleClass();
		class1.size(86.7f);
		class1.getCount();
		
	}

	@Override
	public double size(float count) {
		this.count = count;
		return count;
	}

}
