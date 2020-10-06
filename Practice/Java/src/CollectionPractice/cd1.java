package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//LIST

public class cd1 {

	public static void main(String[] args) {
		//Collection one
		ArrayList  al = new ArrayList();
		al.add("deepika");
		al.add("yash");
		al.add(9032);
		al.add(39);
		al.add("rupa");
		al.add("chetan");
		//Collection two
		ArrayList a2 = new ArrayList();
		a2.add("Hi");
		a2.add(89);
		a2.add("hlow");
		a2.add(10);
		
		//Methods in list
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.set(2, 400));
		System.out.println(al);
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.indexOf("deepika"));
		System.out.println(al.lastIndexOf(400));
		System.out.println(al.addAll(a2));
		System.out.println(al);
		
		//For each loop
		System.out.println("===========");
		for(Object o : al) {
			System.out.print(o+"  ");
		}
		System.out.println();
		System.out.println();
		
		
		//Iterator
		System.out.println("SIMPLE ITERATOR");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" = ");
		}
		System.out.println("==================");
		
		System.out.println();
		System.out.println();
		
		
		
		//listIterator
		System.out.println("LIST ITERATOR");

		ListIterator lt = al.listIterator();
		while (lt.hasNext()) {
			System.out.print(lt.next()+" list  ");
		}
		
		
		System.out.println();
		System.out.println("===================");
		while (lt.hasPrevious()) {
			System.out.print(lt.previous()+" --- ");
		}
		
		System.out.println();
		
		//Traversing throgh object
		Object obj = al.get(1);
		System.out.println(obj);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		//sum
		System.out.println(sum(al));

	}
	
	static int sum(ArrayList al) {
		int s=0;
		for(Object ob : al) {
			if(ob instanceof Integer) {
				Integer i = (Integer)ob;
				s+=i;
				//return s;
			}
		}
		return s;
	}

}
