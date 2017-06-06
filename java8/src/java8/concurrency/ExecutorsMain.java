package java8.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsMain {

	public ExecutorsMain() {
		startThread();
	}

	public static void main(String[] args) {
	
		@SuppressWarnings("unused")
		ExecutorsMain main = new ExecutorsMain();

	}
	public static final int NTHREADS = 1000;
	public static void startThread(){
		ExecutorService service = Executors.newFixedThreadPool(NTHREADS);
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			Runnable work = new MyRunnable(100000L+i);
			service.execute(work);
		}
		service.shutdown();
		while(!service.isTerminated()){
			
		}
		
		long end = System.currentTimeMillis();
		System.out.println("running time of program "+(end - start));
	}

}
