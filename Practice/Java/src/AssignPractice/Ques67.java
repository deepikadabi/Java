
package AssignPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ques67 {

	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("D://CDAC//JAVA//CDAC//Java//TextSol//Assign1.txt");
			ObjectInputStream ois = new ObjectInputStream(is);
			Ques67 emp = (Ques67) ois.readObject();
			ois.close();
			is.close();
			System.out.println(emp.toString());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
