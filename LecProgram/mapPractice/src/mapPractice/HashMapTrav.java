package mapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTrav {

	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<>();

		m.put("rno",123);
		m.put("name","deep");
		m.put("fee", 99);
		m.put(null,909.38);
		
		Set<String> key = m.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
