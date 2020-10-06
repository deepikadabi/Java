package mapPractice;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		HashMap<String, Object> m = new HashMap<>();
		m.put("rno",123);
		m.put("name","deep");
		m.put("fee", 99);
		//System.out.println(m);
		Object obj = m.get("name");
		System.out.println(obj);
		
	}

}
