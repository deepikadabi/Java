package CollectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//ArrayList
public class cd4 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		//myComp m = new myComp;
		al.add("yellow");
		al.add("pink");
		al.add("blue");
		al.add("green");
		al.add("begani");
		al.add("black");
		//for(Object o : al)
		//System.out.print(o+" ");
		al.add(2, "white");
		//System.out.println();
		al.set(2, "hellow");
		//System.out.println(al);
		al.remove(3);
		//System.out.println(al.indexOf("green"));
        Collections.sort(al); 
        Object b = al.clone();
       // System.out.println(" al : "+al);
        Collections.reverse(al);
       // System.out.println(al);

        List<String> sub_List = al.subList(0, 3);
      //  System.out.println(sub_List);
        ArrayList c = (ArrayList)b;
        Collections.shuffle(c);
		//System.out.println(" b : "+c);
        
        //Swap
		System.out.println("befor : "+al);
		String s = al.get(2);
		al.set(2, al.get(4));
		al.set(4, s);
		System.out.println(" After : "+al);

		//Join two arrayList
		al.addAll(c);
		System.out.println(al);
		
		//Empty
		c.clear();
		System.out.println(c);
		
		//Check Empty or not
		System.out.println(c.isEmpty());
		System.out.println(al.isEmpty());
		
		//tream to size
		System.out.println(al.size());
		al.trimToSize();
		System.out.println(al.size());
		
		//increase size of arraylist
        al.ensureCapacity(20);
        System.out.println(al.size());
        
        //21. Write a Java program to replace the second element of an ArrayList with the specified element. 
        al.set(2, "depika");
        System.out.println(al);
        
        //22. Write a Java program to print all the elements of an ArrayList using the position of the elements.
        int no_of_elements = al.size();
        for (int index = 0; index < no_of_elements; index++)
         System.out.println(al.get(index));
       }

		//System.out.println(com);
	}


