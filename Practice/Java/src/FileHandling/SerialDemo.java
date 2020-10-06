package FileHandling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	private int empId;
	String name;
	
	Employee(int empId, String name){
		this.empId = empId;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return empId+" "+name;		
	}
}
public class SerialDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("D:\\CDAC\\JAVA\\CDAC\\Java\\Practice\\my.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(new Employee(201, "deeepika"));
		f.close();
		System.out.println("Success");
		
	}

}
