package CollectionPractice;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {

//1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

		TreeSet t = new TreeSet();
		t.add("pink");
		t.add("blue");
		t.add("yellow");
		t.add("black");
		t.add("purple");
		t.add("white");
		System.out.println(t);
		
//2. Write a Java program to iterate through all elements in a tree set. 

		Iterator it = t.iterator();
		for(Object ob : t)
			System.out.print(ob+" ");
		System.out.println();
		
//3. Write a Java program to add all the elements of a specified tree set to another tree set. 

		TreeSet st = new TreeSet(t);
		for(Object ob : st)
			System.out.print(ob+" ");
		System.out.println();
		
//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.

		Iterator dt = t.descendingIterator();
		while(dt.hasNext())
			System.out.print(dt.next()+" ");
		System.out.println();
		
//5. Write a Java program to get the first and last elements in a tree set.

		System.out.print(t+" ");
		System.out.println();
		System.out.println(t.first());
		System.out.println(t.last());
		
//6. Write a Java program to clone a tree set list to another tree set. 

		TreeSet tst = (TreeSet)t.clone();
		System.out.print(tst);
		System.out.println();
		
//7. Write a Java program to get the number of elements in a tree set. 

		System.out.println(tst.size());
		
//8. Write a Java program to compare two tree sets. 
		
		System.out.print(t);
		System.out.println();
		tst.add("what");
		tst.remove("blue");
		tst.remove("black");
		System.out.print(tst);
		System.out.println();
		for( Object o : t)
			System.out.print(tst.contains(o) ? " yes " : " no ");
		
		System.out.println();
		for( Object o : tst)
			System.out.print(t.contains(o) ? " yes " : " no ");
	
//9. Write a Java program to find the numbers less than 7 in a tree set. 

		TreeSet tn = new TreeSet();
		SortedSet tr = new TreeSet();
		System.out.println();
		tn.add(20);
		tn.add(3);
		tn.add(5);
		tn.add(6);
		tn.add(12);
		tn.add(18);
		System.out.println(tn);

		tr = tn.headSet(7);
		Iterator itt = tr.iterator();
		while(itt.hasNext())
			System.out.print(itt.next()+" ");
		System.out.println();
		
//10. Write a Java program to get the element in a tree set which is greater than or equal to the given element.

		tr = tn.tailSet(7);
		Iterator ittt = tr.iterator();
		while(ittt.hasNext())
			System.out.print(ittt.next()+" ");
		System.out.println();
		
//11. Write a Java program to get the element in a tree set which is less than or equal to the given element. 

		System.out.print(tn+" ");
		System.out.println(tn.floor(11));
		System.out.println(tn.higher(11));
		
//12. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element. 

		System.out.println(tn.ceiling(13));
		
//13. Write a Java program to get an element in a tree set which is strictly less than the given element.

		System.out.println(tn.lower(14));

//14. Write a Java program to retrieve and remove the first element of a tree set.

		System.out.println(tn+" ");
		System.out.println(tn.pollLast());
		System.out.println(tn+" ");
		
//15. Write a Java program to retrieve and remove the last element of a tree set. 

		System.out.println(tn.pollFirst());
		
//16. Write a Java program to remove a given element from a tree set. 
		System.out.println(tn+" ");
		tn.remove(6);
		System.out.println(tn+" ");


	
	}

}

