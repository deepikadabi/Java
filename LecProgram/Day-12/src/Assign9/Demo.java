package Assign9;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		Collection a = new ArrayList();
		a.add(123);
		a.add("Deepika dabi");
		a.add(287.3879);
		
		Iterator it = a.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
