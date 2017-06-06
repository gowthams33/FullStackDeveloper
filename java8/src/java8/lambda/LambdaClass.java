package java8.lambda;

public class LambdaClass {
	
	public LambdaClass() {
		Travel tlam = (len,si) -> len+si;
		double re = tlam.getcount(86.7, 76.5f);
		System.out.println(re);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaClass class1 = new LambdaClass();
	}

}
