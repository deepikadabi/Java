package Exception;
import java.io.IOException;
public class Demo1 {

	public static void main(String[] args) {
		int i = Integer.parseInt("abb"); //unchecked
		try {
			int j = System.in.read();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(i);
		
	}

}
