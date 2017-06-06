package java8.lambda;

public class FinalLam {

	int count = 0;
	public FinalLam() {
		Travel travel = (len,si) -> {
			System.out.println(len+"   "+si);
			len = ++count;
			return len+si;
		};
		System.out.println(travel.getcount(958.54, 65.33f));
	}

	public static void main(String[] args) {
		FinalLam lam = new FinalLam(); 

	}

}
