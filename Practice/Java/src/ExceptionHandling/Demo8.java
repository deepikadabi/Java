package ExceptionHandling;

import java.io.IOException;

public class Demo8 {

	public static void main(String[] args) {
		try {
			m1();
			System.out.println("m1 try");
		} catch (IOException e) {
			System.out.println("m1 catch");
			//e.printStackTrace();
		}
		System.out.println("out");
	}

	static void m1() throws IOException {
		m2();
	}
	
	static void m2() throws IOException {
		throw new IOException();
	}
}
