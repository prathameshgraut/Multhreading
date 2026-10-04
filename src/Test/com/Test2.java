package Test.com;

public class Test2 {
	
	//Synchronized Method
	
	public synchronized void m1() {
		System.out.println("Hello");
		System.out.println("Prathamesh");
		System.out.println("Raut");
		System.out.println("Bhavesh");
		System.out.println("Harshal");
		System.out.println("Pratik");
	}
	
	//object  Level Synchronized block
	public void m2() {
		
		synchronized (this) {
		System.out.println("Hello");
		System.out.println("Prathamesh");
		System.out.println("Raut");
		}
		
		
		System.out.println("Bhavesh");
		System.out.println("Harshal");
		System.out.println("Pratik");
	}
	
	
	//class Level Synchronized block
		public static void m3() {
			
			synchronized (Test2.class) {
			System.out.println("Hello");
			System.out.println("Prathamesh");
			System.out.println("Raut");
			}
			
			System.out.println("Bhavesh");
			System.out.println("Harshal");
			System.out.println("Pratik");
		}
	
	
}
