package ExceptionHandling;

public class Demo11 {

	public static void main(String[] args) {
		String s[] = {"deep", "2"};
		try {
		String s1 = s[0];
		String s2 = s[1];
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
			int k = i/j;
			System.out.println(k);
		} catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
			System.out.println("exception");
		} finally {
			System.out.println(" =========== ");
		}
		
		System.out.println("finished");
		

	}

}
