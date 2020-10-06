package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream("D:\\CDAC\\JAVA\\CDAC\\Java\\Practice\\my.txt");
		String s = "this is first line ";
		for(int i=0; i<s.length();i++ ) {
			f.write(s.charAt(i));
		}
		f.close();
		System.out.println("success");
	}

}
