package CollectionPractice;
import java.util.*;
public class LInkedListPractice {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Blent");
		l.add("Poul");
		l.add("Amoy");
		l.add("Seny");
		l.add("Laxi");
		l.add("Alexa");
		
		System.out.println(l);
		
		//1. Write a Java program to append the specified element to the end of a linked list.
		l.addLast("Lity");
		System.out.println(l);
		
		//2. Write a Java program to iterate through all elements in a linked list. 
		for(Object o : l)
				System.out.print(o+" ");
		System.out.println();
		
		//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
		for(int i = 2; i<l.size(); i++)
			System.out.print(l.get(i)+" ");
		System.out.println();
		
		//4. Write a Java program to iterate a linked list in reverse order. 
		Collections.reverse(l);
		System.out.print(l);
		System.out.println();
		
		//--------------------
		Iterator it = l.descendingIterator();
		while(it.hasNext())
			System.out.print(it.next()+"  ");
		System.out.println();
		//----------------------------
		for(int i = l.size()-1; i>=0; i--)
			System.out.print(l.get(i)+" ");
		System.out.println();
		
		
		//5. Write a Java program to insert the specified element at the specified position in the linked list
		l.add(4, "what");
		System.out.println(l);
		System.out.println();
		
		//6. Write a Java program to insert elements into the linked list at the first and last position.
		l.addFirst("Start");
		l.addLast("end");
		System.out.println(l);
		
		//7. Write a Java program to insert the specified element at the front of a linked list. 
		l.offerFirst("again start");
		System.out.println(l);
		System.out.println();
		
		//8. Write a Java program to insert the specified element at the end of a linked list. 
		l.offerLast("endHai");
		System.out.println(l);
		
		//9. Write a Java program to insert some elements at the specified position into a linked list. 
		LinkedList l1 = new LinkedList();
		l.addAll(2, l1);
		System.out.println(l);
		System.out.println();
		
		//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//11. Write a Java program to display the elements and their positions in a linked list. 
		for(int i=0; i<l.size(); i++)
			System.out.println(i+"  "+l.get(i));
		System.out.println();
		
		//12. Write a Java program to remove a specified element from a linked list.
		l.remove("deepika");
		System.out.println(l);
		System.out.println();
		
		//13. Write a Java program to remove the first and last element from a linked list.
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
		//14. Write a Java program to remove all the elements from a linked list.
		//l.removeAll(l);
		System.out.println(l);
		System.out.println();
		
		//15. Write a Java program of swap two elements in a linked list.
		System.out.println(l);
		Collections.swap(l, 2, 3);
		System.out.println(l);
		System.out.println();
		
		//16. Write a Java program to shuffle the elements in a linked list. 
		Collections.shuffle(l);
		System.out.println(l);
		System.out.println();
		
		//17. Write a Java program to join two linked lists.
		l.addAll(l);
		System.out.println(l);
		
		//18. Write a Java program to clone an linked list to another linked list.
		LinkedList l2 = new LinkedList();
		System.out.println(l1);
		l1 = (LinkedList) l.clone();
		System.out.println(l1);
		System.out.println();
		
		//19. Write a Java program to remove and return the first element of a linked list.
		System.out.println(l1);
		//l1.removeFirst();
		l1.pop();
		System.out.println(l1);
		
		//20. Write a Java program to retrieve but does not remove, the first element of a linked list.
		System.out.println(l1.get(0));
		System.out.println(l1.peekFirst());
		System.out.println(l1);
		
		//21. Write a Java program to retrieve but does not remove, the last element of a linked list. 
		System.out.println(l1.peekLast());
		
		//22. Write a Java program to check if a particular element exists in a linked list. 
		System.out.println(l1.contains("Rupali"));
		
		//23. Write a Java program to convert a linked list to array list. 
		List al = new ArrayList(l1);
		System.out.println(al);
		
		
		//24. Write a Java program to compare two linked lists. 
		ArrayList<String> com = new ArrayList<String>();
		for(Object e : l) {
			com.add(l1.contains(e)?"true":"false");
		}
		System.out.println(com);
		
		//25. Write a Java program to test whether a linked list is empty or not. 
		System.out.println(l1.isEmpty());
		System.out.println();
		
		//26. Write a Java program to replace an element in a linked list. 
		System.out.println(l1);
		l1.set(2, "yassss");
		System.out.println(l1);
	}

}
