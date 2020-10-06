package ExceptionHandling;

public class Demo9 {

	public static void main(String[] args) {
		String s1 = "10";
		String s2 = "0";
		int j = Integer.parseInt(s1);
		int k = Integer.parseInt(s2);
		try {
			int x = j/k;
			System.out.println(x);

		} catch (Exception e) {
			System.out.println("cant divide by zero");
		}
		
		
		//System.out.println(x);
	}

}
