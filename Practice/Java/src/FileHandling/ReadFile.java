package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D:\\CDAC\\JAVA\\CDAC\\Java\\Practice\\my.txt");
		int ch = -1;
		while((ch = f.read()) != -1) {
			System.out.print((char)ch);
		}
		f.close();
		System.out.println("Successs");
		

	}

}
