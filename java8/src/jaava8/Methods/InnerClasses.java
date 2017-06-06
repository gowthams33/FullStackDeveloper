package jaava8.Methods;

public class InnerClasses {
	
	public InnerClasses() {
		
		//Anaymonous inner class
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Anaymonous inner class");				
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
	
	//Normal Inner class
	class InsideClass{
		int count;
		public void display(){
			System.out.println("inside class");
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		InnerClasses classes = new InnerClasses();
		InsideClass class1 = classes.new InsideClass();
		class1.display();
		System.out.println(class1.count);
		classes.MethodClass();
		Example.display();

	}
	
	//Inside inner class
	public void MethodClass() throws InterruptedException{
		class InsideMecthodclass{
			public InsideMecthodclass() {
				System.out.println("Method inside class");
			}
		}
		InsideMecthodclass mecthodclass = new InsideMecthodclass();
		//mecthodclass.wait(10000);
	}
	
	//static class..
	static class Example{
		static int var;
		static{
			var++;
			System.out.println("static block..");
		}
		static void display(){
			System.out.println("static method.."+var);
		}
	}
}
