package p1;

class AddThread implements Runnable
{
	int x;
	int y;
	Thread t;
	MyMathClass maths;
	public AddThread(int x, int y,MyMathClass maths) {
		super();
		this.x = x;
		this.y = y;
		this.maths = maths;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
			
		maths.getSum(x, y);
	}
}

public class ThreadStuff {
	public static void main(String[] args) {
		MyMathClass maths = new MyMathClass();
		AddThread t1 = new AddThread(15, 100,maths);
		AddThread t2 = new AddThread(1055, 85100,maths);
		AddThread t3 = new AddThread(999, 888,maths);
		
		//Thread t = new Thread(runnableObject);
		//t.start();
		
	}
}



