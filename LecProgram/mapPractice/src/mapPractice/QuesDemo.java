package mapPractice;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QuesDemo {
	public static void main(String args[]) {
		Queue<Integer> q = new LinkedList<>(); 
		q.add(123);
		q.add(90);
		q.add(12);
		q.add(56);
		q.add(87);
		q.add(34);
		
		System.out.println(q);
		
		Iterator iterator = q.iterator(); 
        while (iterator.hasNext()) { 
            System.out.println(iterator.next() + " "); 
        } 
	}
}
