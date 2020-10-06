package CollectionPractice;
import java.util.*;
import java.util.Map.Entry;
public class MapDemo1 {

	public static void main(String[] args) {
		HashMap<Object, Object> h = new HashMap();
		h.put("deepika", 20);
		h.put("yash", 78);
		h.put("chetan", 10);
		h.put("sakshi", 90);
		h.put("shalu", 50);
		h.put("lxu", 20);
		h.put("yashji", 430);
		
		System.out.println(h);
		System.out.println(h.get("sakshi"));
		
		 for (Entry e : h.entrySet()) 
	            System.out.println(e.getKey() + " " + e.getValue()); 
	   
		
	}

}
