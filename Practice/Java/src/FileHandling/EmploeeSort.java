package FileHandling;

import java.lang.Comparable;
import java.util.*;

class Employeee implements Comparable
{
	public int eid;
	public String name;
	
	
	Employeee(String name, int eid){
		this.eid = eid;
		this.name = name;
	}
	
	public String toString() {
		return eid+" "+name;
	}
	
	public int compareTo(Object o) {
		Employeee e = (Employeee)o;
		int e2 = this.eid;
		int e1 = e.eid;
		
		if(e2 > e1)
			return +1;
		else if (e1 > e2)
			return -1;
		else 
			return 0;	
	}
}


class myComparator implements Comparator{
	
	
	public int compare(Object o1, Object o2) {
		Employeee m = (Employeee)o1;
		Employeee m1 = (Employeee)o2;

		String e2 = m.name;
		String e1 = m1.name;
		
		return e2.compareTo(e1);
	
	}
	
}
public class EmploeeSort {

	public static void main(String[] args) {
		Employeee e1 = new Employeee("deepika",200);
		Employeee e2 = new Employeee("yash",100);
		Employeee e3 = new Employeee("chetan",40);
		Employeee e4 = new Employeee("crush",300);
		Employeee e5 = new Employeee("pratik",490);
//By default sorting comparable.........
//		TreeSet t = new TreeSet();
//		t.add(e1);
//		t.add(e2);
//		t.add(e3);
//		t.add(e4);
//		t.add(e5);
//		System.out.println(t);
//Customize aorting comparator..........		
		
		TreeSet t1 = new TreeSet(new myComparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}

}
