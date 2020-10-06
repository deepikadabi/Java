package Collection;

import java.util.ArrayList;

class Employee{
	int name;
	String id;
	
	Employee(){}
	
	Employee(int name, String id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return name+ " "+id;
	}
	
}
public class collDemo {

	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add("epi",3467);
		
	}

}
