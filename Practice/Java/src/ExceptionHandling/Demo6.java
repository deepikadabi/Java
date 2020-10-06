package ExceptionHandling;

public class Demo6 {

	public static void main(String[] args) throws Exception {
		System.out.println("main 1");
		deep();
		System.out.println("main 2");
	}
	public static void deep() throws Exception {
		System.out.println("deep 1");
		dip();
		System.out.println("deep 2");
	}
	public static void dip() throws Exception{
		System.out.println("dip 1");
		Thread.sleep(1000);
		System.out.println("dip 2");
	}

}
