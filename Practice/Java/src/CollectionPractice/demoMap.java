package CollectionPractice;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
public class demoMap {

	public static void main(String[] args) {
		HashMap<String, Object> h = new HashMap<>();
		h.put("dip", 1000);
		h.put("yash", 1200);
		h.put("chet", 9000);
		h.put("why", 200);
		h.put("what", 90);
		h.put("kyu", 78);
		
		System.out.println(h);
		
		//To see only one value
		System.out.println(h.get("dip"));
		
		//To see only keys
		Set<String> s =h.keySet();
		Iterator i = s.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println("================");
		//To see only values
		Collection<Object> col = h.values();
		Iterator<Object> itr = col.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//show both key & value
		
		Set<Entry<String, Object>> sh = h.entrySet();
		
		Iterator<Entry<String, Object>> ittr = sh.iterator();
		while(ittr.hasNext())
		{
			System.out.println(ittr.next());
		}
		System.out.println("--------------");
		
		for( Entry<String, Object> f : sh )
			System.out.println(f);
		
		//Sorting
		SortedMap<String, Object> sm = new TreeMap<>(); 
		sm.put("yip", 1000);
		sm.put("sh", 1200);
		sm.put("deet", 9000);
		sm.put("ioy", 200);
		sm.put("iaat", 90);
		sm.put("hisu", 78);
		System.out.println(sm);
		
		Set<String> st = sm.keySet();
		Iterator or = st.iterator();
		while(or.hasNext())
			System.out.println(or.next());
		
		//Set<Object> ob = sm.values();
		Collection<Object> ob = sm.values();
		Iterator<Object> ior = ob.iterator();
		while(ior.hasNext())
			System.out.println(ior.next());
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		TreeMap tm = new TreeMap(sm);
//		tm.put("yip", 1000);
//		tm.put("sh", 1200);
//		tm.put("deet", 9000);
//		tm.put("ioy", 200);
//		tm.put("iaat", 90);
//		tm.put("hisu", 78);
		System.out.println(tm);
		
		

		
	}

}
