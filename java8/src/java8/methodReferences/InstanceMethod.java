package java8.methodReferences;

import java.util.StringJoiner;
import java.util.function.BiFunction;

public class InstanceMethod {

	public void oparation(){
		
		
		BiFunction<InstanceMethod, String, String> bifun = (metho,val) -> {
			return 	metho.modify(val);
		};
		System.out.println(bifun.apply(new InstanceMethod(),"Google Ebay paypal Microsoft"));
		
		BiFunction<InstanceMethod, String, String> mebifun = InstanceMethod :: modify;
		System.out.println(mebifun.apply(new InstanceMethod(),"Gowtham"));
		
	}
	 
	 
	 public String modify (String value){
		 String temp = value;
		 StringJoiner strjoin = new StringJoiner("=", "#$", "$#");
		 value = ""+strjoin.add(temp);
		 return value;
	 }
	public static void main(String[] args) {
		
		InstanceMethod method = new InstanceMethod();
		method.oparation();

	}

}
