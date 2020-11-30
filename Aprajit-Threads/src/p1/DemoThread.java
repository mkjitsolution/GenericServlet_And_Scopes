package p1;

class AprajitThread extends Thread
{

	@Override
	public void run() {
		System.out.println("Aparjit Thread Work ");
	}
	
}

public class DemoThread {
	
	public static void main(String[] args) {
		
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName);
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		AprajitThread at = new AprajitThread();
		at.start();
		
	}

}
