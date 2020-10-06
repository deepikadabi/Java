package StringPra;

public class demo2 {

	public static void main(String[] args) {
		String s = "hi i am deepika dabi from indore!";
		System.out.println(s);
		
		System.out.println("length : "+s.length());
		
		System.out.println("upper : "+s.toUpperCase());
		
		System.out.println("lower : "+s.toLowerCase());
		
		System.out.println("index of : "+s.indexOf('p'));

		System.out.println("get : "+s.charAt(5));

		System.out.println("lasst : "+s.lastIndexOf('o'));

		System.out.println(s);
		System.out.println("first char : "+s.substring(0, 1));
		
		System.out.println(s.contains("deepika"));
		
		System.out.println(s.concat("by by by!!!"));
		
		System.out.println(s.replace("deepika", "chetan"));
		System.out.println(s);
		
		System.out.println(s.valueOf("chetan"));
		
		System.out.println(s.subSequence(6, 15));
		
		System.out.println(s.substring(0, 1).toUpperCase()+s.substring(1));
		
		String ar[] = s.split(" ");
		for( Object o : ar)
			System.out.println(o);

		String str = s.join("\t", ar);
		System.out.println(str);
	}

}
