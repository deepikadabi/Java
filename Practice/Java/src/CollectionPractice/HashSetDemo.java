package CollectionPractice;
import java.util.*;
public class HashSetDemo {
public static void main(String[] args) {
  // HashSet<String> h = new HashSet<String>();
   HashSet h = new HashSet();
        h.add("Red");
        h.add("Green");
        h.add("Black");
        h.add("White");
        h.add("Pink");
        h.add("Yellow");
 System.out.println(h);
 
 
 //1. Write a Java program to append the specified element to the end of a hash set. 
 		h.add("null");
 		System.out.println(h);
 		
 //2. Write a Java program to iterate through all elements in a hash list. 
 		Iterator it = h.iterator();
 		while(it.hasNext()) {
 			System.out.print(" "+it.next());
 		}
 		System.out.println();
 		
 //3. Write a Java program to get the number of elements in a hash set. 
 		System.out.println(h.size());
 		
 //4. Write a Java program to empty a hash set. 
 		//h.removeAll(h);
 		//h.clear();
 		System.out.println(h);
 		
 //	5. Write a Java program to test if a hash set is empty or not. 
 		System.out.println(h.isEmpty());
 		
 //6. Write a Java program to clone a hash set to another hash set.
 		HashSet hs = new HashSet();
 		System.out.println(hs);
 		hs = (HashSet)h.clone();
 		System.out.println(hs);
 		
 //7. Write a Java program to convert a hash set to an array. 
 		String[] s = new String[hs.size()];
 		h.toArray(s);
 		System.out.println("========");
 		for(String t : s)
 			System.out.print(t+"  ");
 		System.out.println();
 		
 //8. Write a Java program to convert a hash set to a tree set.
 		Set ts = new TreeSet(h);
 		for(Object t : ts)
 	 		System.out.print(t+"  ");
 		System.out.println();
 		
 //9. Write a Java program to convert a hash set to a List/ArrayList. 
 		List l = new ArrayList(h);
 		System.out.println("======List=====");
 		for(Object t : l)
 	 		System.out.print(t+"  ");
 		System.out.println();
 		
 //10. Write a Java program to compare two hash sets. 
 		Set e = new HashSet();
 		h.add("neha");
 		System.out.println(h+" h");
 		System.out.println(hs+" hs ");
 		for(Object o : h)
 		System.out.print(hs.contains(o)?" true ":" false ");
 		
 //11. Write a Java program to compare two sets and retain elements which are the same on both sets. 
 		HashSet h1 = new HashSet();
 		HashSet h2 = new HashSet();
 		h1.add("Dip");
 		h1.add("Prit");
 		h1.add("Ruh");
 		h2.add("Dip");
 		h2.add("Deep");
 		h2.add("Ruh");
 		h1.retainAll(h2);
 		System.out.println();
 		System.out.println(h1);
 
 //12. Write a Java program to remove all of the elements from a hash set. 
 		//h1.removeAll(h1);
 		h1.clear();
 		System.out.println(h1);
 	
 		
 }
}
