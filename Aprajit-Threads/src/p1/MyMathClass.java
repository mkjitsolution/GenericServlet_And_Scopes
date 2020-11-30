package p1;

public class MyMathClass {
	
	public void getSum(int x,int y)
	{
		System.out.println("A");
		synchronized (this) {
			System.out.println(" Sum of ");
			int a = x;
				try {
					System.out.print(" a "+a);
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			int b = y;
				try {
					System.out.print(" b "+b);
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
				}
			int sum = a+b;
			System.out.print(" is "+sum);
		}
		// 1000 line 
		
		System.out.println("B");
		
	}
}
