package mapPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;


public class travBothMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> m = new HashMap<>();

		m.put("rno",123);
		m.put("name","deep");
		m.put("fee", 99);
		m.put(null,909.38);
		Set<Entry<String, Object>> s = m.entrySet();
		Iterator<Entry<String, Object>> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
	}

}
