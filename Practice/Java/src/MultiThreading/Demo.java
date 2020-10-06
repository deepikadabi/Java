package MultiThreading;

public class Demo {

	public static void main(String[] args) throws Exception {
		System.out.println("start");
		MyThread m = new MyThread(); // new state
		m.start();
		m.sleep(10);
		//runnable
		System.out.println("end");
	}

}

//in this program thread is not blocked
class MyThread extends Thread{
	@Override
	public void run() {			//running state
		for(int i=0; i<10;i++)
			System.out.println(i);
	}
}		//dead state