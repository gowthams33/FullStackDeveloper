package java8.Annotation;

import java.lang.reflect.Method;

public class RuntimeAnnotation {
	
	public RuntimeAnnotation() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	
	@CusAnno(desc = "First annotation ",id = 1)
	public void display(){
		
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		Class classobj = Class.forName("java8.Annotation.RuntimeAnnotation");
		Method metho[] = classobj.getDeclaredMethods();
		for (Method method : metho) {
			System.out.println(method);
			if(method.getName().indexOf("display") != -1){
				CusAnno cus = method.getAnnotation(CusAnno.class);
				System.out.println(cus.desc());
				System.out.println(cus.id());
			}
		}
	}

}
