package CollectionPractice;
import java.util.ArrayList;
class Employee{
	int id;
	String name;

	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id+" "+name;
	}
}

public class cd3 {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(201, "Deep"));
		al.add(new Employee(121, "yash"));
		al.add(new Employee(131, "dip"));
		al.add(new Employee(201, "chet"));
		al.add(new Employee(300, "pra"));
		System.out.println(al);	
	}
}

//----------------------------------