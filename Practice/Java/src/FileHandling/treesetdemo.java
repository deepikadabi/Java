package FileHandling;

import java.util.Comparator;
import java.util.TreeSet;

class myComp implements Comparator{
	public int compare(Object obj1, Object obj2) {
//		Integer i1 = (Integer)obj1;
//		Integer i2 = (Integer)obj2;

		return ((Integer) obj2).compareTo((Integer)obj1);
		//return i1.compareTo(i2);
	}
	
}

public class treesetdemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new myComp());
		t.add(20);
		t.add(0);
		t.add(30);
		t.add(18);
		t.add(90);
		System.out.println(t);

	}

}
