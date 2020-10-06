package sep29_collection;

import java.util.TreeSet;

class Employee22 implements Comparable<Employee2>{
	private int empId;
	private String empName;
	public Employee22(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " " + empName;
	}
	@Override
	public int compareTo(Employee2 o) {
		return empId - o.empId;
	}
	
}
public class CollectionDemo18 {

	public static void main(String[] args) {
		TreeSet<Employee22> a = new TreeSet<Employee22>();
		a.add(new Employee22(31, "ram"));
		a.add(new Employee22(13, "shiv"));
		a.add(new Employee22(41, "rama"));
		a.add(new Employee22(23, "shiva"));
		a.add(new Employee22(31, "ram"));
		a.add(new Employee22(14, "mohan"));
		for(Employee22 e : a) {
			System.out.println(e);
		}
		
	}

}
