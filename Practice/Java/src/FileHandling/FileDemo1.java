package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\CDAC\\JAVA\\CDAC\\Java\\Practice");
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		boolean b = f.createNewFile();
		f.list();
		System.out.println(b);
		String files[] = f.list();
		for(String s : files)
		{
			System.out.println(s);
		}
		
	}

}
