package Test.com;

public class Test{
	public static void main(String[] args) {
		Thread t1 = new MyThreads();
		t1.start();
	}
}


class MyThreads extends Thread{
	 @Override
	public void run() {
		 System.out.println("Hello");
	}
}