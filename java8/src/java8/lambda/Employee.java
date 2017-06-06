package java8.lambda;

public class Employee {

	int id;
	double sal;
	String name;
	
	public Employee(int id,double sal,String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id "+id+" Name "+name+" salary "+sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
