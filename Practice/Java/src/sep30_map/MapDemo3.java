package sep30_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {

	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<>();
		
		m.put("rno", 123);
		m.put("name", "ram");
		m.put("fee", 9090.50);
		m.put(null, 9090.50);
		
		Set<Object> col = (Set<Object>) m.values();
		Iterator<Object> it = col.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}

	}

}
