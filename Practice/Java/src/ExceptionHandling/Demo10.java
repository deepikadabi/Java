package ExceptionHandling;

public class Demo10 {

	public static void main(String[] args) {
		String s[] = {"deep", "2"};
		try {
		String s1 = s[0];
		String s2 = s[1];
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		
			int k = i/j;
			System.out.println(k);
		} catch (ArithmeticException e) {
			System.out.println("Arith");
		} catch (NumberFormatException e) {
			System.out.println("Number not found");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" OUt of bound");
		}
		
		System.out.println("finished");
		
	}

}
