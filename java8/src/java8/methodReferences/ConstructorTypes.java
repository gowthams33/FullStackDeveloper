package java8.methodReferences;

public class ConstructorTypes {
	public int id;
	public long mobile;
	public String Add;
	public ConstructorTypes() {
		System.out.println("Empty cons called.....");
	}
	
	public ConstructorTypes(int id){
		this.id = id;
		System.out.println("single parameter cons...."+id);
	}
	
	public ConstructorTypes (int id, long mobile){
		this.id = id;
		this.mobile = mobile;
		System.out.println("double parameters cons...."+id+"......"+mobile);
	}
	
	public ConstructorTypes(int id, long mobile, String Add){
		this.id = id;
		this.mobile = mobile;
		this.Add = Add;
		System.out.println("three parameters cons...."+id+"....."+mobile+"....."+Add);
	}
	
	

}
