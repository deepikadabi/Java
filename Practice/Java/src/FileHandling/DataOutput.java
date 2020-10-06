package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;

public class DataOutput {

	public static void main(String[] args) throws Exception {

		FileOutputStream f = new FileOutputStream("D:\\CDAC\\JAVA\\CDAC\\Java\\Practice\\my.txt");
		DataOutputStream d = new DataOutputStream(f);
		d.writeInt(14576);
		d.writeUTF("ramm");
		d.writeDouble(6789.287);
		d.close();
		System.out.println("Successs");
		
	}

}
