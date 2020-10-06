package sep30_map;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<>();
		
		m.put("rno", 123);
		m.put("name", "ram");
		m.put("fee", 9090.50);
		m.put(null, 9090.50);
		
		System.out.println(m); 
		if(m.containsKey(s))
		System.out.println(m.get("name"));
		Object obj = m.get("name1");
		System.out.println(obj);

	}

}
