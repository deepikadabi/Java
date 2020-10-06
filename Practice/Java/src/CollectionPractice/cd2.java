package CollectionPractice;

import java.util.HashSet;
import java.util.Set;

public class cd2 {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(30);
		s.add("deepika");
		s.add("yash");
		s.add(9032);
		s.add(39);
		s.add("rupa");
		s.add("chetan");
		
		System.out.println(s);
		System.out.println(sum(s));
	}
	
	//this will not support
	static int sum(Set s) {
		int sum = 0;
		for(Object o : s) {
			if(o instanceof Integer) {
				Integer i = (Integer)o;
				sum += i;
			}
		}
		return 0;	
	}
}
