package mapPractice;

import java.util.ArrayList;
import java.util.Collections;

public class collescol {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("shiv");
		a1.add("yash");
		a1.add("hi");
		a1.add("hlow");
		a1.add("ruh");
		a1.add("rud");
		a1.add("shiv");
		
		System.out.println(a1);
		Collections.sort(a1);		
		System.out.println(a1);

	}

}
