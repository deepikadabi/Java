package StringPra;

public class demo1 {

	public static void main(String[] args) {
		String s = "abc";
		System.out.println(s);
		
		String s1 = new String("bcd");
		System.out.println(s1);
		
		String s2 = new String(s1);
		System.out.println(s2);
		
		byte ar[] = {67, 68, 69, 70, 71};
		String s3 = new String(ar);
		System.out.println(s3);
		
		char arr[] = {'a', 'b', 'c', 'd'};
		String s4 = new String(arr);
		System.out.println(s4);
	}

}
