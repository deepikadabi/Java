package ExceptionHandling;

public class Demo1 {

	public static void main(String[] args) {

		try {
			System.out.println("Deep");
			System.out.println(10/0);
			System.out.println("Dabi");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		System.out.println("finished");
	}

}
