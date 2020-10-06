package ExceptionHandling;
import java.io.IOException;

public class Demo7 {

	public static void main(String[] args) throws IOException {
		d1();
	}
	
	public static void d1() throws IOException {
		d2();
	}
	public static void d2() throws IOException {
		System.out.println("enter num");
		int j = System.in.read();
		System.out.println((char)j);
		
	}

}
