package java8.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<Long>{

	
	@Override
	public Long call() throws Exception {
		long sum = 0;
		for(long i = 0;i<=100;i++)
			sum += i;
		return sum;
	}
	
}

public class CallableMain {

	public static final int NTHREADS = 1000;
	
	public static void main(String[] args) {
	
		ExecutorService service = Executors.newFixedThreadPool(NTHREADS);
		List<Future<Long>> list = new ArrayList<Future<Long>>();
		for(int i = 0;i<20000;i++){
			Callable<Long> callable = new MyCallable();
			Future<Long> future = service.submit(callable);
			list.add(future);
		}
		long sum = 0;
		service.shutdown();
		
		System.out.println("Finally   ");
		for (Future<Long> futureone : list) {
			try {
				sum += futureone.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(sum);
	}

}
