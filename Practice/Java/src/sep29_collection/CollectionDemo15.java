package sep29_collection;

import java.util.ArrayList;
import java.util.Collection;
class Employe{
	private int empId;
	private String empName;
	public Employe(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empId + " " + empName;
	}
	
}
public class CollectionDemo15 {

	public static void main(String[] args) {
		ArrayList<Employe> a = new ArrayList<Employe>();
		a.add(new Employe(31, "ram"));
		a.add(new Employe(13, "shiv"));
		a.add(new Employe(41, "rama"));
		a.add(new Employe(23, "shiva"));
		a.add(new Employe(31, "ram"));
		a.add(new Employe(14, "mohan"));
		for(Employe e : a) {
			System.out.println(e);
		}
		
	}
	
}
