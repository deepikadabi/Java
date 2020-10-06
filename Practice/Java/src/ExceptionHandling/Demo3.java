package ExceptionHandling;

public class Demo3 {

	public static void main(String[] args) {

		try {
			System.out.println("dip");
			System.out.println(10/0);
			System.out.println("dabi");
		}catch(Exception a){
			System.out.println("yes");
		}
		System.out.println("middle");
		try {}
		finally {
			System.out.println("Final");
		}
	}

}
