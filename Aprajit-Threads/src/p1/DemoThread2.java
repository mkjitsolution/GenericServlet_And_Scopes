package p1;

class MyThread extends Thread
{

	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println(" ***** My Thread Work "+i);
		}
	}
}// end mythread class

class MyThread2 extends Thread
{

	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("====>>>  My Thread2  Work "+i);
		}
	}
}// end mythread class

public class DemoThread2 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
				System.out.println(" Main Thread Work "+i);
		}
		
		MyThread at = new MyThread();
		at.start();
		
		MyThread2 at2 = new MyThread2();
		at2.start();
		
		
		
	}

}
