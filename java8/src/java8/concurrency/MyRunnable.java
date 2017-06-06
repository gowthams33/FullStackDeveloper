package java8.concurrency;

public class MyRunnable implements Runnable{
	
	final long count;
	MyRunnable(long count){
		this.count = count;
	}
	
	@Override
	public void run() {
		long sum = 0l; 
		for (int i = 0; i < count; i++) {
			sum += i;
		}
		System.out.println("Sum of count "+sum);
	}

}
