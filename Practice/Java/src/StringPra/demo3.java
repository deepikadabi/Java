package StringPra;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name & passs ");
		String name = sc.next();
		String pass = sc.next();
		if(name.equalsIgnoreCase("chetan") && pass.equalsIgnoreCase("143")) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("bye!!!");
		}
	}

}
