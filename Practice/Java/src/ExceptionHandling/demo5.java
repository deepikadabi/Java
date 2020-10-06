package ExceptionHandling;
import java.lang.Exception;

import java.io.PrintWriter;

public class demo5{

	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
//		Thread.sleep(1000);
		System.out.println("hi");
	}

}
