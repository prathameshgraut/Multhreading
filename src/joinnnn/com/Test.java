package joinnnn.com;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		Mydemo1 m1 = new Mydemo1();
		Mydemo2 m2 = new Mydemo2();
		Mydemo3 m3 = new Mydemo3();
		
		
		//Join Used for executed thread at sequntialyy
		
		m1.start();
		m1.join();
		
		m2.start();
		m2.join();
		
		m3.start();
		m3.join();
	}
	
	
	
	
	static void m1() {
		System.out.println("Hello1  "+Thread.currentThread().getName());
	}
	
	static void m2() {
		System.out.println("Hello2  "+Thread.currentThread().getId());
	}
	
	static void m3() {
		System.out.println("Hello3  "+Thread.currentThread().getName());
	}
}



class Mydemo1 extends Thread{

	@Override
	public void run() {
		Test.m1();
	}
}

class Mydemo2 extends Thread{

	@Override
	public void run() {
		Test.m2();
	}
}

class Mydemo3 extends Thread{

	@Override
	public void run() {
		Test.m3();
	}
}